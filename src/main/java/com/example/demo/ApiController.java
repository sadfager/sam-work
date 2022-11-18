package com.example.demo;



import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;



import java.util.ArrayList;

import .util.List;



@RestController

public class ApiController

{



    private List<Api> Apis = new ArrayList<>();

    private List<User> user = new ArrayList<>();



    @PostMapping("Api")

    public ResponseEntity<Void> addApi(@RequestBody  )

    {

        if (user.s() == 0)

        {

            user.add(Api.user);

        }

        else

        {

            int x = 0;

            for (int i = 0; i < Apis.s(); i++) {

