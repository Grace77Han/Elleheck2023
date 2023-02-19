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
        blueBin.add("shoes box");
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
    	greenBin.add("food waste");
    	greenBin.add("vegetable scrap");
    	greenBin.add("vegetable peel");
    	greenBin.add("corn cob");
    	greenBin.add("corn husk");
    	greenBin.add("fruit core");
    	greenBin.add("fruit pit");
    	greenBin.add("fruit peel");
    	greenBin.add("meat");
    	greenBin.add("poultry");
    	greenBin.add("fish");
    	greenBin.add("shellfish");
    	greenBin.add("bone");
    	greenBin.add("pasta");
    	greenBin.add("bread");
    	greenBin.add("grain");
    	greenBin.add("cereal");
    	greenBin.add("rice");
    	greenBin.add("flour");
    	greenBin.add("dairy");
    	greenBin.add("egg");
    	greenBin.add("egg shell");
    	greenBin.add("nut");
    	greenBin.add("nutshell");
    	greenBin.add("baked goods");
    	greenBin.add("dessert");
    	greenBin.add("paper napkin");
    	greenBin.add("paper towel");
    	greenBin.add("tissue");
    	greenBin.add("coffee ground");
    	greenBin.add("coffee filter");
    	greenBin.add("tea bag");
    	greenBin.add("food-soiled paper plate");
    	greenBin.add("food-soiled takeout container");
    	greenBin.add("paper muffin cup");
    	greenBin.add("food-soiled pizza boxes");
    	greenBin.add("house plant");
    	greenBin.add("soil");
    	greenBin.add("pet waste");
    	greenBin.add("diaper");
    	greenBin.add("feminine hygiene product");
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
        garbage.add("iv bag");
        garbage.add("iv tubing");
        garbage.add("dialysis waste");
        //garbage.add("household hazardous waste");
        //garbage.add("propane");
        //garbage.add("helium tank");
        //garbage.add("battery");
        //garbage.add("compact fluorescent light bulb");
        //garbage.add("pesticide");
        //garbage.add("paint");
        garbage.add("plastic packaging");
        garbage.add("black plastic");
        garbage.add("black plastic bag");
        garbage.add("black plastic container");
        garbage.add("black plant tray");
        garbage.add("black flower pot");
        garbage.add("compostable bag");
        garbage.add("compostable container");
        garbage.add("compostable cutlery");
        garbage.add("biodegradable bag");
        garbage.add("biodegradable container");
        garbage.add("biodegradable cutlery");
        garbage.add("stand-up resealable pouch bag");
        garbage.add("liner bag");
        garbage.add("cereal liner bag");
        garbage.add("cookie liner bag");
        garbage.add("craker liner bag");
        garbage.add("food wrap");
        garbage.add("bubble wrap");
        garbage.add("pet food wrap");
        garbage.add("squeeze tube");
        garbage.add("toothpaste tube");
        garbage.add("lotion tube");
        garbage.add("paint can");
        garbage.add("plastic straw");
        garbage.add("plastic binder");
        garbage.add("plastic toy");
        garbage.add("plastic clothes hanger");
        garbage.add("cassette");
        garbage.add("cd");
        garbage.add("dvd");
        garbage.add("drinking glass");
        garbage.add("glass dish");
        garbage.add("glass cup");
        garbage.add("crystal");
        garbage.add("ceramic");
        garbage.add("pottery");
        garbage.add("window glass");
        garbage.add("light bulb");
        garbage.add("mirror");
        garbage.add("glass pot");
        garbage.add("glass pan");
        garbage.add("metal tool");
        garbage.add("scrap metal");
        garbage.add("auto parts");
        garbage.add("metal clothes hanger");
        garbage.add("metal pot");
        garbage.add("metal pan");
        garbage.add("electronic");
        garbage.add("metal kettle");
        garbage.add("metal toaster");
        garbage.add("metal hair dryer");
        garbage.add("foil food wrap");
        garbage.add("potato chip bag");
        garbage.add("metallic gift wrap");
        garbage.add("blister pack");
        garbage.add("gum pack");
        garbage.add("clothes");
        garbage.add("shoes");
        garbage.add("carpet");
        garbage.add("curtain");
        garbage.add("bedding");
        //garbage.add("tissue");
        //garbage.add("napkin");
        //garbage.add("paper towel");
        garbage.add("beverage cup");
        garbage.add("frozen food box");
        garbage.add("waxed cardboard");
        garbage.add("waxed paper");
        garbage.add("waxed plastic");
        garbage.add("cable");
        garbage.add("hose");
        garbage.add("rope");
        garbage.add("wood");
        garbage.add("fruit crate");
        garbage.add("wood chopsticks");
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
