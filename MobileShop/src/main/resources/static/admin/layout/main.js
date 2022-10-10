/**
 * 
 */

app = angular.module("admin-app", ['ngRoute','ng.ckeditor']);
app.config(function($routeProvider) {
    $routeProvider
        .when("/accounts", {
            templateUrl: "/admin/layout/account/account_page.html",
            controller: "account-ctrl"
        })
        .when("/attributes" ,{
        templateUrl :"/admin/layout/attribute/attribute_page.html",
		 controller: "attribute-ctrl"
        
    })
        .when("/attribute_groups" ,{
        templateUrl :"/admin/layout/attribute_group/attribute_group_page.html",
		 controller: "attribute-group-ctrl"
        
    	})
        .when("/categories" ,{
	        templateUrl :"/admin/layout/category/category_page.html",
			 controller: "category-ctrl"
	        
	    })
         .when("/category_groups" ,{
	        templateUrl :"/admin/layout/category_group/category_group_page.html",
			 controller: "category-group-ctrl"
	        
	    })
	    .when("/brands" ,{
	        templateUrl :"/admin/layout/brand/brand_page.html",
			 controller: "brand-ctrl"
        
    	})
        .otherwise({
            templateUrl: "/assets/admin/thongke/thongke.html",
            controller: "thongke-ctrl"
        })
})