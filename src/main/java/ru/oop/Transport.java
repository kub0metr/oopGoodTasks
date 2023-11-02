package ru.oop;

public interface Transport extends Positioned{
    /**
     * Перемещает person пока может.
     * @param person
     */
    public void moveTo(Person person);
}
