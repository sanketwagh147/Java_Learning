package com.learn;
class replaceRegex {
    public static void main(String[] args) {
        String text = "{{#}} second {{#}} third {{#}}";
        // String pattern = "^{{#}}$";
        // String pattern = "\\$\\{([^}]*)\\}";
        String pattern = "[\\{]{2}([^}]*)[\\}]{2}";
        System.out.println(text.replaceFirst(pattern, "yay"));
    }
    
}
