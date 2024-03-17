package com.project.SportsStores.Toner.Controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/admin")
public class AdminUI {
    @RequestMapping("/index")
    public String home() {
        return "admin/index";
    }

    @RequestMapping(value = "/product/product_list", method = RequestMethod.GET)
    private String productList() {
        return "admin/products/product-list";
    }

    @RequestMapping(value = "/product/create_product", method = RequestMethod.GET)
    private String nextViewCreateProduct() {
        return "admin/products/product-create";
    }

    @RequestMapping("/account")
    public String account() {
        return "admin/profile/auth";
    }

    @RequestMapping("/account_settings")
    public String accountSeetting() {
        return "admin/profile/auth-settings";
    }

    @RequestMapping("/invoices_create")
    public String invoicesCreate() {
        return "admin/invoice/invoices-create";
    }

    @RequestMapping("/invoices_details")
    public String invoicesDetails() {
        return "admin/invoice/invoices-details";
    }

    @RequestMapping("/invoices_list")
    public String invoicesList() {
        return "admin/invoice/invoices-list";
    }

    @RequestMapping("/orders_list-view")
    public String ordersList() {
        return "admin/orders/orders-list-view";
    }

    @RequestMapping("/orders_overview")
    public String ordersOverview() {
        return "admin/orders/orders-overview";
    }

    @RequestMapping("/categories")
    public String categories() {
        return "admin/products/categories";
    }

    @RequestMapping("/sub_categories")
    public String subCategories() {
        return "admin/products/sub-categories";
    }

    @RequestMapping("/seller_overview")
    public String sellerOverview() {
        return "admin/sellers/seller-overview";
    }

    @RequestMapping("/sellers_grid-view")
    public String sellersGrid() {
        return "admin/sellers/sellers-grid-view";
    }

    @RequestMapping("/sellers_list_view")
    public String sellersList() {
        return "admin/sellers/sellers-list-view";
    }

    @RequestMapping("/shipments")
    public String shipments() {
        return "admin/shipping/shipments";
    }

    @RequestMapping("/shipping_list")
    public String shippingList() {
        return "admin/shipping/shipping-list";
    }

    @RequestMapping("/brands")
    public String brands() {
        return "admin/brands";
    }

    @RequestMapping("/calendar")
    public String calendar() {
        return "admin/calendar";
    }

    @RequestMapping("/compact")
    public String compact() {
        return "admin/compact";
    }

    @RequestMapping("/coupons")
    public String coupons() {
        return "admin/coupons";
    }

    @RequestMapping("/currency_rates")
    public String currencyRates() {
        return "admin/currency-rates";
    }

    @RequestMapping("/detached")
    public String detached() {
        return "admin/detached";
    }

    @RequestMapping("/horizontal")
    public String horizontal() {
        return "admin/horizontal";
    }

    @RequestMapping("/reviews_ratings")
    public String reviewsRatings() {
        return "admin/reviews-ratings";
    }

    @RequestMapping("/statistics")
    public String statistics() {
        return "admin/statistics";
    }

    @RequestMapping("/transactions")
    public String transactions() {
        return "admin/transactions";
    }

    @RequestMapping("/two_column")
    public String twoColumn() {
        return "admin/two-column";
    }

    @RequestMapping("/users_list")
    public String usersList() {
        return "admin/users-list";
    }
}
