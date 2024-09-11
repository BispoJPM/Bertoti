package com.thehecklers.sburrestdemo;

import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/chas")
class ChaController {
    private List<Cha> chas = new ArrayList<>();

    public ChaController() {
        chas.addAll(List.of(
                new Cha(UUID.randomUUID().toString(), "Chá de Camomila", "Infusão"),
                new Cha(UUID.randomUUID().toString(), "Chá de Gengibre", "Decocção"),
                new Cha(UUID.randomUUID().toString(), "Chá de Hortelã", "Maceração")
        ));
    }

    @GetMapping
    Iterable<Cha> getChas() {
        return chas;
    }

    @GetMapping("/{id}")
    Cha getChaById(@PathVariable String id) {
        return chas.stream()
                .filter(cha -> cha.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("com.thehecklers.sburrestdemo.Cha not found"));
    }

    @PostMapping
    Cha postCha(@RequestBody Cha cha) {
        chas.add(cha);
        return cha;
    }

    @PutMapping("/{id}")
    Cha putCha(@PathVariable String id, @RequestBody Cha cha) {
        int chaIndex = -1;

        for (Cha b : chas) {
            if (b.getId().equals(id)) {
                chaIndex = chas.indexOf(b);
                chas.set(chaIndex, cha);
                break;
            }
        }

        return (chaIndex == -1) ? postCha(cha) : cha;
    }

    @DeleteMapping("/{id}")
    void deleteCha(@PathVariable String id) {
        chas.removeIf(cha -> cha.getId().equals(id));
    }
}
