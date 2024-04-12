/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hvan.qlkh.main;

import java.time.Clock;

/**
 *
 * @author PC
 */
public class App {

    public static void main(String[] args) {
        long before = Clock.systemDefaultZone().millis();
        hvan.qlkh.views.App.main(args);
        long after = Clock.systemDefaultZone().millis();
        System.out.println("Thoi gian thu thi: " + (after - before));
    }
}
