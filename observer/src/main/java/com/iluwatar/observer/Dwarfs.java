package com.iluwatar.observer;

import java.util.logging.Logger;

public class Dwarfs implements WeatherObserver {

    private static final Logger LOGGER = Logger.getLogger(Dwarfs.class.getName());

    @Override
    public void update(WeatherType currentWeather) {
        switch (currentWeather) {
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
