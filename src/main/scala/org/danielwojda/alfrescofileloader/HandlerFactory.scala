package org.danielwojda.alfrescofileloader

import org.danielwojda.alfrescofileloader.config.FileToLoad
import org.danielwojda.alfrescofileloader.fileuploader.FileUploader

class HandlerFactory(val uploader: FileUploader) {

  def getHandlerFor(file: FileToLoad) = () => uploader.uploadFile(file)

}
