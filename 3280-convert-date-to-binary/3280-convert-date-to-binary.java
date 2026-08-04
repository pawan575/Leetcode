class Solution {
    public String convertDateToBinary(String date) {
        int year=Integer.parseInt(date.substring(0,4));
        int month=Integer.parseInt(date.substring(5,7));
        int day=Integer.parseInt(date.substring(8));
        String str="";
        str+=Integer.toBinaryString(year)+"-"+Integer.toBinaryString(month)+"-"+Integer.toBinaryString(day);
        return str;
    }
}