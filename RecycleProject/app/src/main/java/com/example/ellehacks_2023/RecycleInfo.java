package com.example.ellehacks_2023;

import java.util.ArrayList;
import java.util.List;

public class RecycleInfo {
    List<String> blueBin;
    List<String> greenBin;
    List<String> garbage;

    public RecycleInfo() {
    	// initialize lists
        blueBin = new ArrayList<>();
        greenBin = new ArrayList<>();
        garbage = new ArrayList<>();

        // load list elements
        loadBlueBinInfo();
        loadGreenBinInfo();
        loadGarbageInfo();
    }

    private void loadBlueBinInfo() { // Helper for constructor: It updates arrayLists
        blueBin.add("glass");
        blueBin.add("glass bottle");
        blueBin.add("glass jar");
        blueBin.add("rigid plastic");
        blueBin.add("plastic jar");
        blueBin.add("plastic tub");
        blueBin.add("plastic food container");
        blueBin.add("beverage bottle");
        blueBin.add("salad dressing bottle");
        blueBin.add("detergent bottle");
        blueBin.add("soap bottle");
        blueBin.add("shampoo bottle");
        blueBin.add("cd case");
        blueBin.add("dvd case");
        blueBin.add("paper bag");
        blueBin.add("avertising mail");
        blueBin.add("fine paper");
        blueBin.add("envelope");
        blueBin.add("gift wrap");
        blueBin.add("tissue paper");
        blueBin.add("card");
        blueBin.add("shredded paper");
        blueBin.add("soft cover book");
        blueBin.add("hard cover book");
        blueBin.add("paper container");
        blueBin.add("carton");
        blueBin.add("box");
        blueBin.add("sprial wound can");
        blueBin.add("cardboard");
        blueBin.add("boxboard");
        blueBin.add("detergent box");
        blueBin.add("shoe box");
        blueBin.add("tissue box");
        blueBin.add("roll");
        blueBin.add("toilet paper box");
        blueBin.add("paper towel box");
        blueBin.add("wapping paper");
        blueBin.add("foam p]olystyrene");
        blueBin.add("foam food package");
        blueBin.add("foam plate");
        blueBin.add("foam cup");
        blueBin.add("egg carton");
        blueBin.add("takeout container");
        blueBin.add("meat tray");
        blueBin.add("fish tray");
        blueBin.add("protective packaging");
    }
    private void loadGreenBinInfo() { // Helper for constructor: It updates arrayLists
    	// to do
    }
    
    private void loadGarbageInfo() { // Helper for constructor: It updates arrayLists
        garbage.add("milk container");
        garbage.add("juice bottle");
        garbage.add("foam packaging peanut");
        garbage.add("medical waste");
        garbage.add("healthcare waste");
        garbage.add("pgarbageipment");
        garbage.add("needle");
        garbage.add("syringe");
        garbage.add("disposable mask");
        garbage.add("gloves");
        garbage.add("gown");
        garbage.add("pad");
        garbage.add("soiled dressing");
        garbage.add("sponge");
        garbage.add("gauze");
        garbage.add("catheter");
        garbage.add("colostomy bag");
        garbage.add("IV bag");
        garbage.add("IV tubing");
        garbage.add("dialysis waste");
        garbage.add("household hazardous waste");
        garbage.add("propane");
        garbage.add("helium tank");
        garbage.add("battery");
        garbage.add("compact fluorescent light bulb");
        garbage.add("pesticide");
        garbage.add("paint");
        garbage.add("plastic packaging");
        garbage.add("black plastic");
        garbage.add("black plastic bag");
        garbage.add("black plastic container");
        garbage.add("black plant tray");
        garbage.add("black flower pot");
        garbage.add("compostable bag");
        garbage.add("compostable container");
        garbage.add("compostable cutlery");
        // (Yeseul) I need to add more info!
    }

    public String getType(String item) { // Helper for search() : it checks if the item is in any list
        String itemLowercase = item.toLowerCase(); // for removing case sensitive

        if (blueBin.contains(itemLowercase)) {
            return "blue";
        }
        else if (greenBin.contains(itemLowercase)) {
            return "green";
        }
        else if (garbage.contains(itemLowercase)) {
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
//        if (getType == "blue bin") {
//            // Need a function to show blue-bin result (maybe pop up?)
//        }
//        else if (getType == "garbage") {
//            // Need a function to show grey-bin result (maybe pop up?)
//        }
//        else {
//            // Need a function to show error message (Item is not found in any lists, so try search differently again?)
//        }
//    }

}
