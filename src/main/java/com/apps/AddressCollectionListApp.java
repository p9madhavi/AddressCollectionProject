package com.apps;
import com.examples.AddressCollectionList;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class AddressCollectionListApp {

    public static void main(String[] args) {

            List<String> addressStringList = new ArrayList<String>();

        AddressCollectionList aCollectionList = new AddressCollectionList();

            aCollectionList.populateData();
             aCollectionList.printAddresses();
            System.out.println("!!!!!!!!!!!!!!!!!!!!!");

        aCollectionList.countCities();
            System.out.println("!!!!!!!!!!!!!!!!!!!!!");

        aCollectionList.countStates();
            System.out.println("!!!!!!!!!!!!!!!!!!!!!");
        }
}
