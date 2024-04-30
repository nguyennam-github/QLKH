/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hvan.qlkh.main;

import hvan.qlkh.dao.ProductDAO;
import hvan.qlkh.models.Product;
import java.io.IOException;
import java.io.StringReader;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.time.Clock;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

/**
 *
 * @author PC
 */
public class App {

    public static void main(String[] args) throws IOException, JAXBException {
        long before = Clock.systemDefaultZone().millis();
        hvan.qlkh.views.App.main(args);
        long after = Clock.systemDefaultZone().millis();
        System.out.println("Thoi gian thu thi: " + (after - before));
    }
}
