package com.iluwatar.observer.generic;

import com.iluwatar.observer.Dwarfs;
import com.iluwatar.observer.WeatherType;

import java.util.logging.Logger;

import static com.iluwatar.observer.WeatherType.COLD;

public class GDwarfs implements Race {

    private static final java.util.logging.Logger LOGGER = Logger.getLogger(Dwarfs.class.getName());

    @Override
    public void update(GWeather weather, WeatherType weatherType) {
        switch (weatherType) {
            case COLD:
                LOGGER.info("Dwarfs feel comfortable in the cold weather.");
                break;
            case RAINY:
                LOGGER.info("The dwarfs are surprised to see the rain.");
                break;
            case SUNNY:
                LOGGER.info("The dwarfs find the sun annoying.");
                break;
            case WINDY:
                LOGGER.info("Dwarf beards flutter in the wind.");
                break;
            case SNOWY:
                LOGGER.info("The dwarfs look familiar with the snowy weather.");
                break;
            default:
                break;
        }
    }
}
