package service;

import org.springframework.stereotype.Service;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Service
public class InvoiceService {

    private final Retrofit retrofit;
    private final CustomerService customerService;
    private final ProductService productService;

    public InvoiceService() {
        this.retrofit = new Retrofit.Builder()
                .baseUrl("http://localhost:8080")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        this.customerService = retrofit.create(CustomerService.class);
        this.productService = retrofit.create(ProductService.class);
    }

    public Invoice createInvoice(int customerId, int productId, int quantity) {
        Customer customer = customerService.getCustomer(customerId);
        Product product = productService.getProduct(productId);

        if (customer == null || product == null) {
            throw new IllegalArgumentException("Invalid customer or product id");
        }

        Invoice invoice = new Invoice();
        invoice.setCustomerId(customerId);
        invoice.setProductId(productId);
        invoice.setQuantity(quantity);
        invoice.setTotalPrice(product.getPrice() * quantity);

        return invoice;
    }

    // Add other CRUD operations here
}