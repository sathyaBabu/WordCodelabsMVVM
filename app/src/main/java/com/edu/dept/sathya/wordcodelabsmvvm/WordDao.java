package com.edu.dept.sathya.wordcodelabsmvvm;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import java.util.List;

@Dao
public interface WordDao {

//  old 14 we are adding conflict macro
//    @Insert
//    void insert(Word word);

    // 14
     /*
    Add a word that already exists in the list. What happens? Does your app crash?
Your app uses the word itself as the primary key, and each primary key must be unique.
You can specify a conflict strategy to tell your app what to do when the user tries to add an existing word.
In the WordDao interface, change the annotation for the insert() method to:
@Insert(onConflict = OnConflictStrategy.IGNORE)
     */

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    void insert(Word word);


    @Query("DELETE FROM word_table")
    void deleteAll();

    @Query("SELECT * from word_table ORDER BY word ASC")
    LiveData<List<Word>>  getAllWords();


    // 14


}