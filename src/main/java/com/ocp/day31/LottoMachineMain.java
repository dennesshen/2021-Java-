/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocp.day31;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 *
 * @author dennesshen
 */
public class LottoMachineMain {

    public static void main(String[] args) throws Exception {
        System.out.println("準備開場");
        ExecutorService service = Executors.newCachedThreadPool();
        Collection<Callable<Lotto>> list = new ArrayList<>();
        list.add(new LottoMachine(1));
        list.add(new LottoMachine(2));
        list.add(new LottoMachine(3));
        list.add(new LottoMachine(4));
        list.add(new LottoMachine(5));
        System.out.println("開始搖獎");
        List<Future<Lotto>> result = service.invokeAll(list);
        System.out.println("唱名獎號");
        result.forEach(t -> {
            try {
                System.out.println(t.get());
            } catch (Exception e) {
            }
        }
        );
        
        service.shutdown();

    }

}
