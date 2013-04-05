package org.zendesk.client.v2.model.events;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * @author stephenc
 * @since 05/04/2013 11:54
 */
public class CommentEvent extends PublicPrivateEvent {
    private String body;
    private String htmlBody;
    private Boolean trusted;
    private Integer authorId;
    private List<String> attachments;

    public List<String> getAttachments() {
        return attachments;
    }

    public void setAttachments(List<String> attachments) {
        this.attachments = attachments;
    }

    @JsonProperty("author_id")
    public Integer getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Integer authorId) {
        this.authorId = authorId;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    @JsonProperty("html_body")
    public String getHtmlBody() {
        return htmlBody;
    }

    public void setHtmlBody(String htmlBody) {
        this.htmlBody = htmlBody;
    }

    public boolean getTrusted() {
        return trusted;
    }

    public void setTrusted(Boolean trusted) {
        this.trusted = trusted;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("CommentEvent");
        sb.append("{attachments=").append(attachments);
        sb.append(", body='").append(body).append('\'');
        sb.append(", htmlBody='").append(htmlBody).append('\'');
        sb.append(", trusted=").append(trusted);
        sb.append(", authorId=").append(authorId);
        sb.append('}');
        return sb.toString();
    }
}
