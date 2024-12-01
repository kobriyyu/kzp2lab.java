package KI306.Kobriy.Lab2;

import java.io.IOException;

/**
 * Клас MonitorDriver є точкою входу для виконання програми, яка демонструє роботу з класом Monitor.
 */
public class MonitorDriver {
    /**
     * Основний метод для запуску програми.
     *
     * @param args аргументи командного рядка (не використовуються)
     */
    public static void main(String[] args) {
        try {
            Monitor monitor = new Monitor(
                    new Screen(85, 90, false),
                    new Stand(80, 1),
                    new ControlPanel("DisplayPort")
            );
            monitor.turnOn();
            monitor.adjustBrightness(5);
            monitor.adjustContrast(5);
            monitor.adjustTilt(3);
            monitor.adjustHeight(0);
            monitor.activatePowerSavingMode();
            monitor.deactivatePowerSavingMode();
            monitor.changeInputSource("HDMI");
            monitor.getInfo();
            monitor.turnOff();

            monitor.closeLogger();
        } catch (IOException e) {
            // Обробка помилок, що виникають під час запису в файл
            throw new RuntimeException("Сталася помилка при записі в файл: " + e.getMessage());
        }
    }
}

