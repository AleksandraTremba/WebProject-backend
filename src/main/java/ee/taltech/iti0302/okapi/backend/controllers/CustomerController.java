package ee.taltech.iti0302.okapi.backend.controllers;

import ee.taltech.iti0302.okapi.backend.dto.customer.CustomerChangeDataDTO;
import ee.taltech.iti0302.okapi.backend.dto.customer.CustomerInitDTO;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import ee.taltech.iti0302.okapi.backend.dto.customer.CustomerDTO;
import ee.taltech.iti0302.okapi.backend.services.CustomerService;

@RequiredArgsConstructor
@RestController
@RequestMapping("api/")
@Validated
public class CustomerController {
    private final CustomerService customerService;

    @GetMapping("public/customers/{username}")
    public CustomerDTO getData(@PathVariable String username) {
        return customerService.getCustomerData(username);
    }

    @PostMapping("public/customers/login")
    public CustomerDTO login(@RequestBody CustomerInitDTO request) {
        return customerService.login(request);
    }

    @PutMapping("public/customers/register")
    public CustomerDTO registerCustomer(@RequestBody @Valid CustomerInitDTO request) {
        return customerService.register(request);
    }

    @PostMapping("customers/update/username")
    public CustomerDTO updateCustomerUsername(@RequestBody @Valid CustomerChangeDataDTO request) {
        return customerService.updateUsername(request);
    }

    @PostMapping("customers/update/password")
    public CustomerDTO updateCustomerPassword(@RequestBody CustomerChangeDataDTO request) {
        return customerService.updatePassword(request);
    }

    @DeleteMapping("customers/delete")
    public boolean deleteCustomer(@RequestBody CustomerInitDTO request) {
        return customerService.delete(request);
    }
}
