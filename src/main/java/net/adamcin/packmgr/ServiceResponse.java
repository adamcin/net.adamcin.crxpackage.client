package net.adamcin.packmgr;

/**
 * The basic service response interface.
 */
public interface ServiceResponse {
    boolean isSuccess();
    String getMessage();
}
