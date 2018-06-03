package com.rgfp.scrumdeveloper.complexity;

public class Resolver {

    public static final String NO_HAY_PROBLEMA = "No hay problema";
    public static final String AHORA_SI_HAY_PROBLEMA = "Ahora si hay problema";

    public String funciona(boolean funciona, boolean loHasTocado, boolean nosDaraProblema, boolean alguienLoSabe, boolean puedesCulparAOtro){

        if(funciona){
            return "No lo toques, " + NO_HAY_PROBLEMA;
        }
        else
        {
            if(loHasTocado){
                if(alguienLoSabe){
                    if(puedesCulparAOtro){
                        return NO_HAY_PROBLEMA;
                    }
                    else {
                        return "Burro !! " + AHORA_SI_HAY_PROBLEMA;
                    }
                }
                else
                {
                    return "Escondelo, " + NO_HAY_PROBLEMA;
                }
            }
            else {
                if(nosDaraProblema){
                    if(puedesCulparAOtro){
                        return NO_HAY_PROBLEMA;
                    }
                    else {
                        return "Burro !! " + AHORA_SI_HAY_PROBLEMA;
                    }
                }
                else {
                    return "Lanzalo, " + NO_HAY_PROBLEMA;
                }
            }
        }

    }

}