    //Show only begin row
    public void displayRowOnlyBegin() {
        System.out.printf("%-40s WELCOME TO AQUARIUM SHOP\n", "");
        System.out.printf("+------+------+--------------------------------+-------------+-------------------+--------------------------------+\n");
        System.out.printf("+ No.  | ID   | Family name                    | Price       | Selling price     | Origin                         |\n");
        System.out.printf("+------+------+--------------------------------+-------------+-------------------+--------------------------------+\n");
    }

    //Show only end row
    public void displayRowOnlyEnd() {
        System.out.printf("+------+------+--------------------------------+-------------+-------------------+--------------------------------+\n");
    }

    //Show fish with format
    public void showFish(int No, int ID, String getFamilyName, double getImportPrice, double getSellingPrice, String getOrigin) {
        System.out.printf("| %-5d| %-5d| %-31s| $%-10.3f | $%-16.3f | %-31s|\n", No, ID, getFamilyName, getImportPrice, getSellingPrice, getOrigin);
    }
