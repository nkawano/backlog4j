package com.nulabinc.backlog4j;

import java.util.Date;

/**
 * The interface for Backlog shared file.
 *
 * @author nulab-inc
 */
public interface SharedFile {

    long getId();

    String getIdAsString();

    String getType();

    String getName();

    String getDir();

    long getSize();

    User getCreatedUser();

    Date getCreated();

    User getUpdatedUser();

    Date getUpdated();

    boolean isImage();

}
