package com.rikkeiacademy;

import com.rikkeiacademy.functional.MyFunc;
import com.rikkeiacademy.model.Product;
import com.rikkeiacademy.service.GeneralService;
import com.rikkeiacademy.service.impl.GeneralServiceImpl;
import com.rikkeiacademy.service.impl.ProductServiceImpl;

import java.util.*;
import java.util.stream.Collectors;

public class Application {
    public static void main(String[] args) {
        GeneralService service = new GeneralServiceImpl();
        service.testDefault();
        GeneralService productService = new ProductServiceImpl();
        productService.testDefault();

        List<String> names = Arrays.asList("Mai", "Duy", "Quý", "Bình", "Tuấn", "Toàn", "Hải");

        MyFunc<String> myFunc = new MyFunc<String>() {
            @Override
            public boolean test(String obj) {
                return obj.contains("T");
            }
        };
        MyFunc<String> myFunc1 = new MyFunc<String>() {
            @Override
            public boolean test(String obj) {
                return obj.contains("u");
            }
        };
        MyFunc<String> myFunc2 = str -> str.contains("D");


        for (String s : findBy(names, s -> s.contains("M"))) {
            System.out.println(s);
        }


        List<Product> data = new ArrayList<>();
        data.add(new Product(UUID.randomUUID().toString(), "M0213", "Tivi", 3000, true));
        data.add(new Product(UUID.randomUUID().toString(), "M3455", "Điều hòa", 2000, false));
        data.add(new Product(UUID.randomUUID().toString(), "M3462", "Máy giặt", 1000, true));
        data.add(new Product(UUID.randomUUID().toString(), "B2563", "Tủ lạnh", 2000, false));
        data.add(new Product(UUID.randomUUID().toString(), "F2353", "Quạt", 2000, true));
        data.add(new Product(UUID.randomUUID().toString(), "E1325", "Nồi cơm", 1000, false));
        // Sử dụng Stream API, lambda expression
        // 1. Hiển ra danh sách các sp Model bắt đầu bằng "M" : filter
        data.stream()
                .filter(x -> x.getModel().startsWith("M"))
                .collect(Collectors.toList())
                .forEach(x -> System.out.println(x.getModel()));
        // 2. Tìm kiếm 1 sản phẩm theo Model (Model là duy nhất trong collection) : filter().findFirst()
        Product p = data.stream()
                .filter(x -> x.getModel().equals("M3455"))
                .findFirst()
                .orElse(null);
        // 3. Lấy ra danh sách List<String> model sản phẩm : map()
        data.stream()
                .map(Product::getModel)
                .collect(Collectors.toList());
        // 4. Kiểm tra xem trong collection có bất kỳ sản phẩm nào giá > 1000 không? : anyMatch()
        data.stream()
                .anyMatch(x -> x.getPrice() > 1000);
        // 5. Đếm các sản phẩm có cùng mức giá : groupBy
        Map<Double, List<String>> result = data.stream()
                .collect(Collectors
                        .groupingBy(Product::getPrice, Collectors.mapping(Product::getModel, Collectors.toList())));

        for (Double key : result.keySet()) {
            System.out.println(key + ": " + result.get(key));
        }
        // VD: 1000: 2 sp
        //     2000: 3 sp
        //     3000: 1 sp
    }

    public static List<String> findBy(List<String> source, MyFunc<String> myFunc) {
        List<String> result = new ArrayList<>();
        for (String s : source) {
            if (myFunc.test(s)) {
                result.add(s);
            }
        }
        return result;
    }
}
