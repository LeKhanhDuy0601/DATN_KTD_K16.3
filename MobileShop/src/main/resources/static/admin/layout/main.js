/**
 * 
 */

app = angular.module("admin-app", ["ngRoute"]);
app.config(function($routeProvider) {
    $routeProvider
        .when("/accounts", {
            templateUrl: "/admin/layout/account/account_page.html",
            controller: "account-ctrl"
        })
        // .when("/sanpham", {
        //     templateUrl: "/assets/admin/sanpham/sanpham.html",
        //     controller: "sanpham-ctrl"
        // })
        .otherwise({
            templateUrl: "/assets/admin/thongke/thongke.html",
            controller: "thongke-ctrl"
        })
})