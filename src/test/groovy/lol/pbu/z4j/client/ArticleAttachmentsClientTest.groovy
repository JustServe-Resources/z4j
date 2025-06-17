package lol.pbu.z4j.client

import io.micronaut.http.HttpStatus
import jakarta.inject.Inject
import lol.pbu.z4j.model.ArticleObject
import spock.lang.Shared
import spock.lang.Specification

class ArticleAttachmentsClientTest extends Specification {

    @Inject
    @Shared
    ArticleAttachmentsClient articleAttachmentsClient


    //the best way to go about this might be to make a single test that fails if any of the CRUD operations fail
    //first create, then read, then delete (there is no update functionality)


    def "create an attachment for an article"() {
        //theoretically this should work perfectly
        when: "uploading an attachment to an article"
        def article=new ArticleObject("en-US", null, "...")
        //Cannot invoke method createArticleAttachment() on null object
        def response=articleAttachmentsClient.createArticleAttachment(article.getId())
        then: "verify 201 response"
        response.status()== HttpStatus.OK
    }

    def "create bulk attachments for an article"() {
        when: "uploading bulk attachments"
        def response =articleAttachmentsClient.createAttachment()
        then: "verify 201 response"
        response.status()==HttpStatus.OK
    }
    //we need a way to get the article attachment id in order to finish this
    def "delete an attachment from the article"() {
        //we need an article attachment id, ideally we will create an article directly before testing the delete functionality
//        when: "delete an attachment"
//        def article=new ArticleObject("en-US", null, "...")
//        def response =articleAttachmentsClient.deleteArticleAttachment(articleAttachmentId)
//        then: "verify 201 response"
//        response.status()==HttpStatus.OK
    }


    //just read the article attachments
    def "ListArticleAttachments"() {
        when: "uploading bulk attachments"
        def article=new ArticleObject("en-US", null, "...")
        def response =articleAttachmentsClient.listArticleAttachments(article.getId())
        then: "verify 200 response"
        response.status()==HttpStatus.OK
    }

    def "ListBlockArticleAttachments"() {
        when: "uploading bulk attachments"
        def article=new ArticleObject("en-US", null, "...")
        def response =articleAttachmentsClient.listBlockArticleAttachments(article.getId())
        then: "verify 200 response"
        response.status()==HttpStatus.OK
    }

    def "ListInlineArticleAttachments"() {
        when: "uploading bulk attachments"
        def article=new ArticleObject("en-US", null, "...")
        def response =articleAttachmentsClient.listInlineArticleAttachments(article.getId())
        then: "verify 200 response"
        response.status()==HttpStatus.OK
    }

    def "ShowArticleAttachment"() {
        //we need the articleAttachmentId
//        when: "uploading bulk attachments"
//        def article=new ArticleObject("en-US", null, "...")
//        def response =articleAttachmentsClient.showArticleAttachment(article.getId())
//        then: "verify 200 response"
//        response.status()==HttpStatus.OK
    }
}
