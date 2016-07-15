package com.phoenixnap.oss.ramlapisync.raml;

import org.raml.model.parameter.UriParameter;

import java.util.Map;

/**
 * @author armin.weisser
 */
public interface RamlResource extends RamlResourceRoot {

    String getRelativeUri();

    Map<RamlActionType, RamlAction> getActions();

    Map<String, UriParameter> getUriParameters();

    Map<String, UriParameter> getResolvedUriParameters();

    String getUri();

    String getDescription();

    RamlResource getParentResource();

    void setParentResource(RamlResource parentResource);

    String getParentUri();

    void setParentUri(String parentUri);

    void setRelativeUri(String relativeUri);

    void setDisplayName(String displayName);

    void setDescription(String description);

    RamlAction getAction(RamlActionType actionType);

    void addAction(RamlActionType apiAction, RamlAction action);

    void addActions(Map<RamlActionType, RamlAction> actions);
}
