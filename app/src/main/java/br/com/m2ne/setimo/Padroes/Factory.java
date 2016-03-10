package br.com.m2ne.setimo.Padroes;

/**
 * Created by nonilton on 02/03/16.
 */
public class Factory {

    public static Object make(String classe){
        try {
            Class c = Class.forName(classe);
            return c.newInstance();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        return null;
    }
}
