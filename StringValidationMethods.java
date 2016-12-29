public class StringValidationMethods {

    public static void main(String[] args) {
        validateIpAddress("192.1.7");
        consecutiveCounterV3("aaasssddd");

    }

    public static void validateIpAddress(String ipAddress) {
        String regex = "[0-9.]+";
        String alphabetRegex = "[A-Za-z]";
        String blankSpaceRegex = "[\\s\\s]+";

        // validate for null
        if (!(StringUtils.isEmpty(ipAddress)) || ipAddress.matches(blankSpaceRegex) || !(StringUtils.isBlank(ipAddress))) {
            System.out.println("String is neither empty nor blank, proceed to the next validation");
            //validate for period first character
            if (!(StringUtils.startsWith(ipAddress, "."))) {
                System.out.println("String does not start with Zero or Period, proceed to the next validation");
                //validate for letters
                if (!(ipAddress.matches(alphabetRegex))) {
                    System.out.println("The input has no letters, proceed to the next validation");
                    //validate for number and period
                    if (ipAddress.matches(regex)) {
                        System.out.println("The input has numbers and periods, proceed to the next validation");
                        // cut the string into an array of 4 strings  "firstBlock.second.third.andFourth"
                        String digitBits[] = ipAddress.split("\\.");
                        //validate if the input's length is a fit for an IP Address
                        if (digitBits.length == 4) {
                            System.out.println("The input has the correct length proceed to the next validation");
                            int one = Integer.parseInt(digitBits[0]);
                            int two = Integer.parseInt(digitBits[1]);
                            int three = Integer.parseInt(digitBits[2]);
                            int four = Integer.parseInt(digitBits[3]);
                            System.out.println(one);

                            /**
                             * @TODO add a validation for Zero start on each block
                             */
                            //validate if the first block is an eight digit binary number
                            if (one >= 0 && one <= 255) {
                                System.out.println("The first index is an eight digit binary number, move to the second block");
                                //validate the second block
                                if ((two >= 0) && two <= 255) {
                                    System.out.println("The second index is an eight digit binary number, proceed to the third block");
                                    //validate the third block
                                    if ((three >= 0) && three <= 255) {
                                        System.out.println("The third index is an eight digit binary number, proceed to the fourth block");
                                        if (four >= 0 && four <= 255) {
                                            System.out.println("The fourth index is an eight digit binary number");
                                            System.out.println("Validation has passed the input is a real IP Address");
                                        }
                                        //end of fourth block validation
                                        else {
                                            System.out.println("Incorrect input " + four + " is not an eight digit binary number");
                                        }
                                    }
                                    //end of third block validation
                                    else {
                                        System.out.println("Incorrect input " + three + " is not an eight digit binary number");
                                    }
                                }
                                //end of the second block validation
                                else {
                                    System.out.println("Incorrect input " + two + "is not an eight digit binary number");
                                }

                            }
                            //end of first block validation
                            else {
                                System.out.println("Incorrect input " + one + " is not an eight digit binary number");
                            }
                        }
                        // end of the length validation
                        else {
                            System.out.println("Incorrect IP Address, the length is either too long or too short");
                        }


                    }
                    //end of number and period validation
                    else {
                        System.out.println("Invalid IP Address input, you can only use numbers and periods.");
                    }
                }
                // end of validation for letters
                else {
                    System.out.println("Incorrect IP Address, input has letters");
                }
            }
            //end of validation if the first character is a period
            else {
                System.out.println("Incorrect IP Address, the input starts with a Period.");
            }
        }
        //end of null validation
        else {
            System.out.println("Invalid IP Address, either the input is empty or null");
        }
    }


    public static void validateIfStringIsPalindrome(String strPalindrome) {


        //Sample Palindromes == naman .. gruburg .. level .. nsyncnysn

        //register the start index of the string validation
        int start = 0;
        // register the end of the palindrome
        int end = strPalindrome.length() - 1;

        // set the value of isPal to true
        boolean isPalindrome = true;

        // While start is less than end.. I want to increment start and decrement end while
        while (start > end) {

            //Create strings for the start letter and end letter
            String startLetter = strPalindrome.substring(start, start + 1);
            String endLetter = startLetter.substring(end, end + 1);

            if (startLetter.equals(endLetter) == false) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        if (isPalindrome = true) {
            System.out.println(strPalindrome + " is a palindrome");
        } else {
            System.out.println(strPalindrome + " is not a palindrome");
        }
    }


    public static void consecutiveCounter(String strCC) {


        //convert the string to a char array
        char strCCArray[] = strCC.toCharArray();
        String strConsec;
        //make a for loop to get a counter for the array
        for (int i = 0; i < strCCArray.length; i++) {
            while (strCCArray[0] == strCCArray[i]) {
                i++;
            }
        }
    }

    public static void consecutiveCounterV2(String strV2) {

        int start = 0;
        int end = strV2.length() - 1;
        int counter = 0;

        String strV2FirstChar = strV2.substring(start, start + counter);
        String strV2LastChar = strV2.substring(end, end + 1);

        for (int i = start; i < end; i++) {
            System.out.println(i);

        }

        while (strV2FirstChar == strV2FirstChar) {

            counter++;
            System.out.println(strV2FirstChar);
            break;
        }
    }

    public static void consecutiveCounterV3(String strV3) {

        char strV3Array[] = strV3.toCharArray();


        int startOfArray = 0;
        int counter = 1;


        for (int i = 0; i < strV3Array.length; i++) {
            while (strV3Array[i] > strV3Array.length) {
                System.out.println(strV3Array[i]);


                    break;
                    // end of while loop
                }

                //end of for loop
            }
        String newStr = new String(strV3Array);
        System.out.println(newStr);
            //end of consecutiveCounterV3
        }

    //end of class
    }

