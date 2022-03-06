[3]
//Search fish by price
    public void searchFishByPrice() {
        AquariumShop AS = new AquariumShop();
        int a = 0;
        double minPrice, maxPrice;
        boolean isFounded = false;
        Scanner sc = new Scanner(System.in);
        //Input min of price
        while (true) {
            try {
                System.out.print("[+] Input minimum price: ");
                minPrice = Double.parseDouble(sc.nextLine());
                if (minPrice > 0) {
                    break;
                } else {
                    System.out.println("[X] Minimum price must be greater than 0!");
                }
            } catch (NumberFormatException e) {
                System.out.println("[X] Wrong format, please try again!");
            }
        }
        //Input max of price
        while (true) {
            try {
                System.out.print("[+] Input maximum price: ");
                maxPrice = Double.parseDouble(sc.nextLine());
                if (maxPrice > 0) {
                    if (maxPrice > minPrice) {
                        break;
                    } else {
                        System.out.println("[X] Minimum price must be greater than maximum price!");
                    }
                } else {
                    System.out.println("[X] Maximum price must be greater than 0!");
                }
            } catch (NumberFormatException e) {
                System.out.println("[X] Wrong format, please try again!");
            }
        }
        //Search and compare price, show if conditions is true
        for (int i = 0; i < this.listOfFish.size(); i++) {
            //Search for contains FamilyName
            if (this.listOfFish.get(i).getSellingPrice() >= minPrice && this.listOfFish.get(i).getSellingPrice() <= maxPrice) {
                isFounded = true;
                //This use for show only 1 displayRowOnly
                a = a + 1;
                if (a == 1) {
                    System.out.println("[+] The price you requested has been found.");
                    AS.displayRowOnlyBegin();
                }
                //Get ID
                int ID = this.listOfFish.get(i).getID();
                //Get family name
                String familyName = this.listOfFish.get(i).getFamilyName();
                //Get price
                double importPrice = this.listOfFish.get(i).getImportPrice();
                //Get selling price
                double sellingPrice = this.listOfFish.get(i).getSellingPrice();
                //Get origin
                String origin = this.listOfFish.get(i).getOrigin();
                //Use showFish function to show list of fish
                showFish(i + 1, ID, familyName, importPrice, sellingPrice, origin);
            }
        }
        //If cannot found this price
        if (isFounded == false) {
            System.out.println("[!] Price of fish could not be found!");
        } else {
            //This use for show only 1 display end row
            displayRowOnlyEnd();
        }
    }


[5]

//Get list of selling fish
    public void getSellingList() {
        AquariumShop AS = new AquariumShop();
        boolean isFounded = false;
        int a = 0;
        //Search and compare ID
        for (int i = 0; i < this.listOfFish.size(); i++) {
            //Search for contains FamilyName
            if (this.listOfFish.get(i).getSellingPrice() < this.listOfFish.get(i).getImportPrice()) {
                isFounded = true;
                //This use for show only 1 displayRowOnly
                a = a + 1;
                if (a == 1) {
                    System.out.println("[+] Get list of selling price success.");
                    AS.displayRowOnlyBegin();
                }
                //Get ID
                int ID = this.listOfFish.get(i).getID();
                //Get family name
                String familyName = this.listOfFish.get(i).getFamilyName();
                //Get price
                double importPrice = this.listOfFish.get(i).getImportPrice();
                //Get selling price
                double sellingPrice = this.listOfFish.get(i).getSellingPrice();
                //Get origin
                String origin = this.listOfFish.get(i).getOrigin();
                //Update new price
                this.listOfFish.set(i, new Fish(ID, familyName, importPrice, sellingPrice, origin));
                showFish(i + 1, ID, familyName, importPrice, sellingPrice, origin);
            }
        }
        //If cannot found this price
        if (isFounded == false) {
            System.out.println("[!] Price of fish could not be found!");
        } else {
            //This use for show only 1 display end row
            displayRowOnlyEnd();
        }
    }
