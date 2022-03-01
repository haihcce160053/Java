//Load file
public static void loadFile() throws IOException {
        String File = "src/Data/comicbook.txt";
        File dataFile = new File(File);
        if (!dataFile.exists()) { //Check file exist or not
            dataFile.createNewFile(); //If file does not exist create new file
            System.out.println("The data file comicbook.txt is not exits. Creating new data file ...  Done");
            saveFile();
        }
        else {
            //If file exist load data from file into arrray list
            BufferedReader br = new BufferedReader(new FileReader(File));
            try {
                numberOfBook = Integer.parseInt(br.readLine());
                System.out.println("The data file comicbook.txt is found. Data is loading... Done [" + numberOfBook + "]");
                String Title, Author;
                int ID, Volume;
                double bookRentalPrice;
                for (int i = 0; i < numberOfBook; i++) {
                    //Reads answer's information
                    ID = Integer.parseInt(br.readLine());
                    Title = br.readLine();
                    bookRentalPrice = Double.parseDouble(br.readLine());
                    Author = br.readLine();
                    Volume = Integer.parseInt(br.readLine());
                    //Add data into array list
                    comicList.add(new ComicBook(ID, Title, bookRentalPrice, Author, Volume));
                }
            }catch (Exception ex) {
                saveFile();
            }            
            finally {
                //Save data 
                br.close();
            }
        }
    }

//Save file
public void saveAnswer() throws IOException {
        FileWriter fw = new FileWriter(new File(A_FILE), false);
        try {
            System.out.print("\nAnswers is saving into data file answers.txt...");
            //Writes number of answer
            fw.append(String.valueOf(this.numberOfAnswer) + "\n");
            for (int i = 0; i < this.numberOfAnswer; i++) {
                //Ints answer's information
                int aId = this.answers.get(i).getaId();
                String aContent = this.answers.get(i).getaContent();
                boolean aStatus = this.answers.get(i).getaStatus();
                int qId = this.answers.get(i).getqId();

                //Writes answer's information into data file
                fw.append(String.valueOf(aId) + "\n");
                fw.append(aContent + "\n");
                fw.append(String.valueOf(aStatus) + "\n");
                fw.append(String.valueOf(qId) + "\n");
            }
        } finally {
            //Saves data file (from RAM into HDD)
            fw.close();
            if (this.numberOfAnswer > 1) {
                System.out.print("Done! [" + this.numberOfAnswer + " answers]");
            } else {
                System.out.print("Done! [" + this.numberOfAnswer + " answer]");
            }
        }
    }
