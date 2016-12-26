public class ValidateIp{

    public static void main(String[] args) {
        validateIpAddress("012.332.1.0");
    }

    public static void validateIpAddress(String ipAddress){
        String regex = "[0-9.]+";
        String alphabetRegex = "[A-Za-z]";
        String blankSpaceRegex = "[\\s\\s]+";

        // validate for null
        if( !(StringUtils.isEmpty(ipAddress)) || ipAddress.matches(blankSpaceRegex) || !(StringUtils.isBlank(ipAddress))){

            //validate for period first character
            if (!(StringUtils.startsWith(ipAddress, "."))){
                System.out.println("String does not start with Zero or Period, proceed to the next validation");
                //validate for letters
                if(!(ipAddress.matches(alphabetRegex))){
                    System.out.println("The input has no letters, proceed to the next validation");
                    //validate for number and period
                    if(ipAddress.matches(regex)){
                        System.out.println("The input has numbers and periods, proceed to the next validation");


                        // cut the string into an array of 4 strings  "firstBlock.second.third.andFourth"
                        String digitBits[] = ipAddress.split("\\.");
                        //validate if the input's length is a fit for an IP Address
                        if(digitBits.length == 4){
                            System.out.println("The input has the correct length proceed to the next validation");
                            int one = Integer.parseInt(digitBits[0]);
                            int two = Integer.parseInt(digitBits[1]);
                            int three = Integer.parseInt(digitBits[2]);
                            int four = Integer.parseInt(digitBits[3]);


                            /**
                             * @TODO add a validation for Zero start on each block
                             */
                            //validate if the first block is an eight digit binary number
                            if(one >= 0 || one <= 255){
                                System.out.println("The first index is an eight digit binary number, move to the second block");
                                //validate the second block
                                if(( two >= 0) || two <= 255 ){
                                    System.out.println("The second index is an eight digit binary number, proceed to the third block");
                                    //validate the third block
                                    if(( three >= 0) || three <= 255 ){
                                        System.out.println("The third index is an eight digit binary number, proceed to the fourth block");
                                        if( four >= 0 || four <= 255 ){
                                            System.out.println("The fourth index is an eight digit binary number");
                                            System.out.println("Validation has passed the input is a real IP Address");
                                        }
                                        //end of fourth block validation
                                        else {
                                            System.out.println("Incorrect input, The fourth block is not an eight digit binary number");
                                        }
                                    }
                                    //end of third block validation
                                    else {
                                        System.out.println("Incorrect input, The third block is not an eight digit binary number");
                                    }
                                }
                                //end of the second block validation
                                else {
                                    System.out.println("Incorrect input, The second block is not an eight digit binary number");
                                }

                            }
                            //end of first block validation
                            else {
                                System.out.println("Incorrect input, The fourth block is not an eight digit binary number");
                            }
                        }
                        // end of the length validation
                        else {
                            System.out.println("Incorrect IP Address, the length is either too long or too short");
                        }



                    }
                    //end of number and period validation
                    else {
                        System.out.println("Incorrect IP Address, input has no numbers or periods");
                    }
                }
                // end of validation for letters
                else{
                    System.out.println("Incorrect IP Address, input has letters");
                }
            }
            //end of validation if the first character is a period
            else {
                System.out.println("Incorrect IP Address, the input starts with a Period.");
            }

        //end of null validation
        }
    }
}