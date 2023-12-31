/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import DataAccess.FileDAO;

/**
 *
 * @author tuanh
 */
public class FileRepository implements IFileRepository{

    @Override
    public void countWordInFile() {
        FileDAO.Instance().countWordInFile();
    }

    @Override
    public void findFileNameByWord() {
        FileDAO.Instance().findFileNameByWord();
    }
}
