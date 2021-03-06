package com.rosegun.trace.api;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by qct on 2017/3/25.
 */
public class Span {
    private String id;
    private String parentId;
    private String traceId;
    private String name;
    private String serviceName;
    private List<Annotation> annotationList;
    private List<BinaryAnnotation> binaryAnnotationList;

    public Span() {
        this.annotationList = new LinkedList<Annotation>();
        this.binaryAnnotationList = new LinkedList<BinaryAnnotation>();
    }

    public void addAnnotation(Annotation annotation) {
        annotationList.add(annotation);
    }

    public void addAnnotation(BinaryAnnotation binaryAnnotation) {
        binaryAnnotationList.add(binaryAnnotation);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public String getTraceId() {
        return traceId;
    }

    public void setTraceId(String traceId) {
        this.traceId = traceId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public List<Annotation> getAnnotationList() {
        return annotationList;
    }

    public void setAnnotationList(List<Annotation> annotationList) {
        this.annotationList = annotationList;
    }

    public List<BinaryAnnotation> getBinaryAnnotationList() {
        return binaryAnnotationList;
    }

    public void setBinaryAnnotationList(List<BinaryAnnotation> binaryAnnotationList) {
        this.binaryAnnotationList = binaryAnnotationList;
    }
}
