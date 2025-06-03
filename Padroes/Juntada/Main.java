import model.ProdutoModel;
import view.ProdutoView;

public class Main {
    public static void main(String[] args) {
        ProdutoModel model = new ProdutoModel();
        ProdutoView view = new ProdutoView(model);

        view.setVisible(true);
    }
}
