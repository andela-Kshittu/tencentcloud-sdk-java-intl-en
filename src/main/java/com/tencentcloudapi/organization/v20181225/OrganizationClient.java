/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.organization.v20181225;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.organization.v20181225.models.*;

public class OrganizationClient extends AbstractClient{
    private static String endpoint = "organization.tencentcloudapi.com";
    private static String version = "2018-12-25";

    public OrganizationClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public OrganizationClient(Credential credential, String region, ClientProfile profile) {
        super(OrganizationClient.endpoint, OrganizationClient.version, credential, region, profile);
    }

    /**
     *This API is used to accept an invitation to an organization.
     * @param req AcceptOrganizationInvitationRequest
     * @return AcceptOrganizationInvitationResponse
     * @throws TencentCloudSDKException
     */
    public AcceptOrganizationInvitationResponse AcceptOrganizationInvitation(AcceptOrganizationInvitationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AcceptOrganizationInvitationResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<AcceptOrganizationInvitationResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "AcceptOrganizationInvitation"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to add an organizational unit.
     * @param req AddOrganizationNodeRequest
     * @return AddOrganizationNodeResponse
     * @throws TencentCloudSDKException
     */
    public AddOrganizationNodeResponse AddOrganizationNode(AddOrganizationNodeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AddOrganizationNodeResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<AddOrganizationNodeResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "AddOrganizationNode"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to cancel an invitation to an organization.
     * @param req CancelOrganizationInvitationRequest
     * @return CancelOrganizationInvitationResponse
     * @throws TencentCloudSDKException
     */
    public CancelOrganizationInvitationResponse CancelOrganizationInvitation(CancelOrganizationInvitationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CancelOrganizationInvitationResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CancelOrganizationInvitationResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CancelOrganizationInvitation"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create an organization.
     * @param req CreateOrganizationRequest
     * @return CreateOrganizationResponse
     * @throws TencentCloudSDKException
     */
    public CreateOrganizationResponse CreateOrganization(CreateOrganizationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateOrganizationResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateOrganizationResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateOrganization"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete an organization.
     * @param req DeleteOrganizationRequest
     * @return DeleteOrganizationResponse
     * @throws TencentCloudSDKException
     */
    public DeleteOrganizationResponse DeleteOrganization(DeleteOrganizationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteOrganizationResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteOrganizationResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteOrganization"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete an organization member.
     * @param req DeleteOrganizationMemberFromNodeRequest
     * @return DeleteOrganizationMemberFromNodeResponse
     * @throws TencentCloudSDKException
     */
    public DeleteOrganizationMemberFromNodeResponse DeleteOrganizationMemberFromNode(DeleteOrganizationMemberFromNodeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteOrganizationMemberFromNodeResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteOrganizationMemberFromNodeResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteOrganizationMemberFromNode"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete multiple organization members in a single request.
     * @param req DeleteOrganizationMembersRequest
     * @return DeleteOrganizationMembersResponse
     * @throws TencentCloudSDKException
     */
    public DeleteOrganizationMembersResponse DeleteOrganizationMembers(DeleteOrganizationMembersRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteOrganizationMembersResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteOrganizationMembersResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteOrganizationMembers"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete multiple organizational units in a single request.
     * @param req DeleteOrganizationNodesRequest
     * @return DeleteOrganizationNodesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteOrganizationNodesResponse DeleteOrganizationNodes(DeleteOrganizationNodesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteOrganizationNodesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteOrganizationNodesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteOrganizationNodes"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to decline an invitation to an organization.
     * @param req DenyOrganizationInvitationRequest
     * @return DenyOrganizationInvitationResponse
     * @throws TencentCloudSDKException
     */
    public DenyOrganizationInvitationResponse DenyOrganizationInvitation(DenyOrganizationInvitationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DenyOrganizationInvitationResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DenyOrganizationInvitationResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DenyOrganizationInvitation"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to obtain information on organizations.
     * @param req GetOrganizationRequest
     * @return GetOrganizationResponse
     * @throws TencentCloudSDKException
     */
    public GetOrganizationResponse GetOrganization(GetOrganizationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetOrganizationResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<GetOrganizationResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "GetOrganization"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to obtain information on organization members.
     * @param req GetOrganizationMemberRequest
     * @return GetOrganizationMemberResponse
     * @throws TencentCloudSDKException
     */
    public GetOrganizationMemberResponse GetOrganizationMember(GetOrganizationMemberRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetOrganizationMemberResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<GetOrganizationMemberResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "GetOrganizationMember"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to obtain an invitation list.
     * @param req ListOrganizationInvitationsRequest
     * @return ListOrganizationInvitationsResponse
     * @throws TencentCloudSDKException
     */
    public ListOrganizationInvitationsResponse ListOrganizationInvitations(ListOrganizationInvitationsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ListOrganizationInvitationsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ListOrganizationInvitationsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ListOrganizationInvitations"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to obtain a list of organization members.
     * @param req ListOrganizationMembersRequest
     * @return ListOrganizationMembersResponse
     * @throws TencentCloudSDKException
     */
    public ListOrganizationMembersResponse ListOrganizationMembers(ListOrganizationMembersRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ListOrganizationMembersResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ListOrganizationMembersResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ListOrganizationMembers"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to obtain a list of organizational unit members.
     * @param req ListOrganizationNodeMembersRequest
     * @return ListOrganizationNodeMembersResponse
     * @throws TencentCloudSDKException
     */
    public ListOrganizationNodeMembersResponse ListOrganizationNodeMembers(ListOrganizationNodeMembersRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ListOrganizationNodeMembersResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ListOrganizationNodeMembersResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ListOrganizationNodeMembers"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to obtain a list of organizational units.
     * @param req ListOrganizationNodesRequest
     * @return ListOrganizationNodesResponse
     * @throws TencentCloudSDKException
     */
    public ListOrganizationNodesResponse ListOrganizationNodes(ListOrganizationNodesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ListOrganizationNodesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ListOrganizationNodesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ListOrganizationNodes"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to move members to a specified organizational unit.
     * @param req MoveOrganizationMembersToNodeRequest
     * @return MoveOrganizationMembersToNodeResponse
     * @throws TencentCloudSDKException
     */
    public MoveOrganizationMembersToNodeResponse MoveOrganizationMembersToNode(MoveOrganizationMembersToNodeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<MoveOrganizationMembersToNodeResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<MoveOrganizationMembersToNodeResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "MoveOrganizationMembersToNode"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to quit an organization.
     * @param req QuitOrganizationRequest
     * @return QuitOrganizationResponse
     * @throws TencentCloudSDKException
     */
    public QuitOrganizationResponse QuitOrganization(QuitOrganizationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<QuitOrganizationResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<QuitOrganizationResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "QuitOrganization"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to send an invitation to join an organization.
     * @param req SendOrganizationInvitationRequest
     * @return SendOrganizationInvitationResponse
     * @throws TencentCloudSDKException
     */
    public SendOrganizationInvitationResponse SendOrganizationInvitation(SendOrganizationInvitationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SendOrganizationInvitationResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<SendOrganizationInvitationResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "SendOrganizationInvitation"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to update information on organization members.
     * @param req UpdateOrganizationMemberRequest
     * @return UpdateOrganizationMemberResponse
     * @throws TencentCloudSDKException
     */
    public UpdateOrganizationMemberResponse UpdateOrganizationMember(UpdateOrganizationMemberRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateOrganizationMemberResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateOrganizationMemberResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "UpdateOrganizationMember"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to update organizational units.
     * @param req UpdateOrganizationNodeRequest
     * @return UpdateOrganizationNodeResponse
     * @throws TencentCloudSDKException
     */
    public UpdateOrganizationNodeResponse UpdateOrganizationNode(UpdateOrganizationNodeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateOrganizationNodeResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateOrganizationNodeResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "UpdateOrganizationNode"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

}
