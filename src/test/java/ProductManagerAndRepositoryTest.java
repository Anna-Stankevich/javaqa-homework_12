import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.java_hw_12.AllAboutProducts.Book;
import ru.netology.java_hw_12.AllAboutProducts.Product;
import ru.netology.java_hw_12.AllAboutProducts.Smartphone;


public class ProductManagerAndRepositoryTest {

    ProductRepository repo = new ProductRepository();
    ProductManager manager = new ProductManager(repo);

    Product item1 = new Book(01, "Книга", 350, "'Унесенные ветром'", "Маргарет Митчелл");
    Product item2 = new Book(02, "Книга", 550, "'Скарлетт'", "Александра Рипли");
    Product item3 = new Smartphone(03, "Смартфон", 15_990, "Xiaomi Poco M3 Pro 6/128Gb", "Xiaomi Corporation");

    @Test
    public void checkSaveMethod() {

        repo.save(item1);
        repo.save(item2);
        repo.save(item3);
        Product[] expected = {item1, item2, item3};
        Product[] actual = repo.getProducts();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void checkRemoveByIdMethod() {

        repo.save(item1);
        repo.save(item2);
        repo.save(item3);
        repo.removeById(item2.getId());

        Product[] expected = {item1, item3};
        Product[] actual = repo.getProducts();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void checkSearchByMethod() {
        manager.add(item1);
        manager.add(item2);
        manager.add(item3);
        Product[] expected = {item1, item2};
        Product[] actual = manager.searchBy("Книга");

        Assertions.assertArrayEquals(expected, actual);
    }
}
