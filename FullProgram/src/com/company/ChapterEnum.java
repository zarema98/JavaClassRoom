package com.company;

public enum ChapterEnum {
    CHAPTER2 ("Глава 2. Всё является объектом"),
    CHAPTER3 ("Глава 3. Операторы"),
    CHAPTER4 ("Глава 4. Управляющие конструкции"),
    CHAPTER5 ("Глава 5. Инициализация и завершение"),
    CHAPTER6 ("Глава 6. Управление доступом"),
    CHAPTER7 ("Глава 7. Повторное использование классов"),
    CHAPTER8 ("Глава 8. Полиморфизм");



    private String chapterName;

    ChapterEnum(String chapterName) {
        this.chapterName = chapterName;
    }

    public String getChapterName() {
        return chapterName;
    }
}
