package pl.bykowski.security2;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class QuotationApi {

    private List<Quotation> quotations;

    public QuotationApi() {
        this.quotations = new ArrayList<>();
        quotations.add(new Quotation("To, że milcze nie znaczy ze nie ma nic do powiedzenia.", "Jonathan Carol"));
        quotations.add(new Quotation("Lepiej zaliczac sie do niektorych niz do wszystkich", "Andrzej Sapkowski"));
    }

    @GetMapping("/api")
    public List<Quotation> getQuotations() {
        return quotations;
    }

    @PostMapping("/api")
    public boolean addQuotations(@RequestBody Quotation quotation) {
        return quotations.add(quotation);
    }

    @DeleteMapping("/api")
    public void deleteQuotations(@RequestParam int index) {
        quotations.remove(index);
    }


}
