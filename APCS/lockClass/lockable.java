package APCS.lockClass;
public interface lockable
{
    /** lock
     *  Locks the methods if the key given equals the original key
     * @param key the key for the class
     */
    abstract public void lock(int key);

    /** unlock
     * Unlocks the methods if the key given equals the original key
     * @param key the key for the class
     */
    abstract public void unlock(int key);

    /** setKey
     *  Sets the key for the class to be a specific integer value
     * @param currentKey the old key
     * @param newKey the new key
     */
    abstract public void setKey(int currentKey, int newKey);

    /** locked
     *  Tests whether the class is locked or unlocked
     * @return if the class is locked
     */
    abstract public boolean locked();
}

