package threds;




/**
 * Задача копирования файла в отдельном потоке
 * 
 * @author nedis
 * @version .0
 */
public interface CopyFileTask extends Task {
	/**
	 * Устанавливает алгоритм копирования файлов. созданный в предыдущем задании
	 * 
	 * @param copyUtils алгоритм копирования файлов
	 */
	void setFileCopyUtils(FileCopyUtils copyUtils);
}
