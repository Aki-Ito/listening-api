package com.example.listening_api.controller;

import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.GetMapping;

// ②メソッドにつけるアノテーションを考える(GETで/api/healthに割り当てる)
@RestController 
public class HealthController {
    //@GetMappingアノテーション付きメソッドは、与えられたURI表現式と一致するHTTP GETリクエストを処理します。
    @GetMapping("api/health")
    public String health() {
        //"ok"を返す
        return "ok";
    }
}
