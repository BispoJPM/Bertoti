package com.thehecklers.sburrestdemo;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/Chas")
public class ChaController {
    private List<Cha> Chas = new ArrayList<>();

    public ChaController() {
        Chas.addAll(List.of(
                new Cha("Infusão", "Hortelã"),
                new Cha("Maceração", "Canela"),
                new Cha("Decocção", "Eucalipto")
        ));
    }

    @GetMapping
    Iterable<Cha> getChas() {
        return Chas;
    }

    @GetMapping("/{id}")
    Cha getChaById(@PathVariable String id) {
        return Chas.stream()
                .filter(Cha -> Cha.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Cha not found"));
    }

    @PostMapping
    Cha postCha(@RequestBody Cha Cha) {
        Chas.add(Cha);
        return Cha;
    }

    @PutMapping("/{id}")
    Cha putCha(@PathVariable String id, @RequestBody Cha Cha) {
        int ChaIndex = -1;

        for (Cha b : Chas) {
            if (b.getId().equals(id)) {
                ChaIndex = Chas.indexOf(b);
                Chas.set(ChaIndex, Cha);
                break;
            }
        }

        return (ChaIndex == -1) ? postCha(Cha) : Cha;
    }

    @DeleteMapping("/{id}")
    void deleteCha(@PathVariable String id) {
        Chas.removeIf(Cha -> Cha.getId().equals(id));
    }
}
