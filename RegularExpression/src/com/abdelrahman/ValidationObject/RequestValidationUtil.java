package com.abdelrahman.ValidationObject;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class RequestValidationUtil implements Serializable {
    public RequestValidationUtil() {
    }

    public static boolean validateRequest(Object someObject, String rgx) {
        boolean result = true;
        List<Field> fieldsList = new ArrayList();
        fieldsList.addAll(Arrays.asList(someObject.getClass().getDeclaredFields()));
        if(someObject.getClass().getSuperclass() != null) {
            fieldsList.addAll(Arrays.asList(someObject.getClass().getSuperclass().getDeclaredFields()));
        }

        if(someObject.getClass().getSuperclass().getSuperclass() != null) {
            fieldsList.addAll(Arrays.asList(someObject.getClass().getSuperclass().getSuperclass().getDeclaredFields()));
        }

        Iterator var5 = fieldsList.iterator();

        while(var5.hasNext()) {
            Field field = (Field)var5.next();

            try {
                field.setAccessible(true);
                Object value = field.get(someObject);
                if(value != null) {
                    if(field.getType().getSimpleName().equals("String")) {
                        String v = String.valueOf(value);
                        if(v.matches(rgx)) {
                            System.out.println("name: " + field.getName() + " = " + v + " type : " + field.getType().getSimpleName());
                        } else {
                            result = false;
                            System.err.println("Error in matching ");
                        }
                    } else {
                        System.out.println(field.getName() + "=" + value + " type : " + field.getType().getSimpleName());
                    }
                }
            } catch (IllegalAccessException var8) {
                System.err.println("");
                result = false;
            }
        }

        return result;
    }

    public static boolean validateRequest(Object someObject, String fieldName, String rgx) {
        boolean result = true;

        try {
            Field selectedField = someObject.getClass().getDeclaredField(fieldName);
            selectedField.setAccessible(true);
            Object value = selectedField.get(someObject);
            if(value != null) {
                if(selectedField.getType().getSimpleName().equals("String")) {
                    String v = String.valueOf(value);
                    if(v.matches(rgx)) {
                        System.out.println("name: " + selectedField.getName() + " = " + v + " type : " + selectedField.getType().getSimpleName());
                    } else {
                        result = false;
                        System.err.println("Error in matching ");
                    }
                } else {
                    System.out.println(selectedField.getName() + "=" + value + " type : " + selectedField.getType().getSimpleName());
                }
            }
        } catch (NoSuchFieldException  var7) {
            System.err.println("");
            result = false;
        } catch (IllegalAccessException  var7) {
            System.err.println("");
            result = false;
        }

        return result;
    }
}
