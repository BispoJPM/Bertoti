package view;

import controller.ProdutoController;
import model.Observer;
import model.ProdutoModel;
import strategy.AdicionarProduto;
import strategy.RemoverProduto;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@SuppressWarnings("serial")
public class ProdutoView extends JFrame implements Observer {
    private ProdutoModel model;
    private JTextArea areaProdutos;
    private JTextField campoEntrada;

    public ProdutoView(ProdutoModel model) {
        this.model = model;
        model.adicionarObserver(this);

        setTitle("Gestor de Produtos");
        setSize(500, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel painel = new JPanel(new BorderLayout());

        areaProdutos = new JTextArea();
        areaProdutos.setEditable(false);
        JScrollPane scroll = new JScrollPane(areaProdutos);

        painel.add(scroll, BorderLayout.CENTER);

        JPanel painelInferior = new JPanel(new FlowLayout());

        campoEntrada = new JTextField(20);
        JButton btnAdicionar = new JButton("Adicionar");
        JButton btnRemover = new JButton("Remover");

        painelInferior.add(new JLabel("Produto:"));
        painelInferior.add(campoEntrada);
        painelInferior.add(btnAdicionar);
        painelInferior.add(btnRemover);

        painel.add(painelInferior, BorderLayout.SOUTH);

        setContentPane(painel);

        btnAdicionar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String texto = campoEntrada.getText();
                if (!texto.isBlank()) {
                    ProdutoController controller = new ProdutoController(new AdicionarProduto(model));
                    controller.executarAcao(texto);
                    campoEntrada.setText("");
                }
            }
        });

        btnRemover.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String texto = campoEntrada.getText();
                if (!texto.isBlank()) {
                    ProdutoController controller = new ProdutoController(new RemoverProduto(model));
                    controller.executarAcao(texto);
                    campoEntrada.setText("");
                }
            }
        });
    }

    @Override
    public void update() {
        StringBuilder sb = new StringBuilder();
        for (String p : model.getProdutos()) {
            sb.append("- ").append(p).append("\n");
        }
        areaProdutos.setText(sb.toString());
    }
}
