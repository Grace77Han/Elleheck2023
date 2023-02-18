package com.example.ellehacks_2023;

import java.util.ArrayList;
import java.util.List;

public class RecycleInfo {
    List<String> recyclable;
    List<String> nonRecyclable;

    public RecycleInfo() {
        recyclable = new ArrayList<>();
        nonRecyclable = new ArrayList<>();

        loadRecycleInfo();
        loadNonRecycleInfo();
    }

    private void loadRecycleInfo() { // Helper for constructor: It updates arrayLists
        recyclable.add("glass");
        recyclable.add("glass bottle");
        recyclable.add("glass jar");
        recyclable.add("rigid plastic");
        recyclable.add("plastic jar");
        recyclable.add("plastic tub");
        recyclable.add("plastic food container");
        recyclable.add("beverage bottle");
        recyclable.add("salad dressing bottle");
        recyclable.add("detergent bottle");
        recyclable.add("soap bottle");
        recyclable.add("shampoo bottle");
        recyclable.add("cd case");
        recyclable.add("dvd case");
        recyclable.add("paper bag");
        recyclable.add("avertising mail");
        recyclable.add("fine paper");
        recyclable.add("envelope");
        recyclable.add("gift wrap");
        recyclable.add("tissue paper");
        recyclable.add("card");
        recyclable.add("shredded paper");
        recyclable.add("soft cover book");
        recyclable.add("hard cover book");
        recyclable.add("paper container");
        recyclable.add("carton");
        recyclable.add("box");
        recyclable.add("sprial wound can");
        recyclable.add("cardboard");
        recyclable.add("boxboard");
        recyclable.add("detergent box");
        recyclable.add("shoe box");
        recyclable.add("tissue box");
        recyclable.add("roll");
        recyclable.add("toilet paper box");
        recyclable.add("paper towel box");
        recyclable.add("wapping paper");
        recyclable.add("foam p]olystyrene");
        recyclable.add("foam food package");
        recyclable.add("foam plate");
        recyclable.add("foam cup");
        recyclable.add("egg carton");
        recyclable.add("takeout container");
        recyclable.add("meat tray");
        recyclable.add("fish tray");
        recyclable.add("protective packaging");

    }

    private void loadNonRecycleInfo() { // Helper for constructor: It updates arrayLists
        nonRecyclable.add("milk container");
        nonRecyclable.add("juice bottle");
        nonRecyclable.add("foam packaging peanut");
        nonRecyclable.add("medical waste");
        nonRecyclable.add("healthcare waste");
        nonRecyclable.add("protective equipment");
        nonRecyclable.add("needle");
        nonRecyclable.add("syringe");
        nonRecyclable.add("disposable mask");
        nonRecyclable.add("gloves");
        nonRecyclable.add("gown");
        nonRecyclable.add("pad");
        nonRecyclable.add("soiled dressing");
        nonRecyclable.add("sponge");
        nonRecyclable.add("gauze");
        nonRecyclable.add("catheter");
        nonRecyclable.add("colostomy bag");
        nonRecyclable.add("IV bag");
        nonRecyclable.add("IV tubing");
        nonRecyclable.add("dialysis waste");
        nonRecyclable.add("household hazardous waste");
        nonRecyclable.add("propane");
        nonRecyclable.add("helium tank");
        nonRecyclable.add("battery");
        nonRecyclable.add("compact fluorescent light bulb");
        nonRecyclable.add("pesticide");
        nonRecyclable.add("paint");
        nonRecyclable.add("plastic packaging");
        nonRecyclable.add("black plastic");
        nonRecyclable.add("black plastic bag");
        nonRecyclable.add("black plastic container");
        nonRecyclable.add("black plant tray");
        nonRecyclable.add("black flower pot");
        nonRecyclable.add("compostable bag");
        nonRecyclable.add("compostable container");
        nonRecyclable.add("compostable cutlery");
        // (Yeseul) I need to add more info!
    }

    public String isRecyclable(String item) { // Helper for search() : it checks if the item is in any list
        String itemLowercase = item.toLowerCase(); // for removing case sensitive

        if (recyclable.contains(itemLowercase)) {
            return "recycle";
        }
        else if (nonRecyclable.contains(itemLowercase)) {
            return "garbage";
        }
        else { // Can't search that such object
            return "Search failed";
        }
    }

    /** Use this for search!!!
     * @param String from search bar (input string)
     */
//    public void search(String s) {
//
//        if (isRecyclable(s) == "Yes") {
//            // Need a function to show blue-bin result (maybe pop up?)
//        }
//        else if (isRecyclable(s) == "No") {
//            // Need a function to show grey-bin result (maybe pop up?)
//        }
//        else {
//            // Need a function to show error message (Item is not found in any lists, so try search differently again?)
//        }
//    }

}
