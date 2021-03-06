/**
 * FactSet SCIM API
 * FactSet's SCIM API implementation.
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from './ApiClient';
import Error from './model/Error';
import GroupResource from './model/GroupResource';
import GroupResourceList from './model/GroupResourceList';
import GroupResourceMembers from './model/GroupResourceMembers';
import GroupResourceMeta from './model/GroupResourceMeta';
import GroupResourceUrnScimSchemasExtensionFactSetEnterpriseHosting10Group from './model/GroupResourceUrnScimSchemasExtensionFactSetEnterpriseHosting10Group';
import LocationResource from './model/LocationResource';
import LocationResourceList from './model/LocationResourceList';
import LocationResourceMeta from './model/LocationResourceMeta';
import LocationResourceReference from './model/LocationResourceReference';
import Patch from './model/Patch';
import PatchOperations from './model/PatchOperations';
import PendingProductOrder from './model/PendingProductOrder';
import ProductResource from './model/ProductResource';
import ProductResourceList from './model/ProductResourceList';
import ProductResourceMeta from './model/ProductResourceMeta';
import ProductResourceReference from './model/ProductResourceReference';
import Schema from './model/Schema';
import SchemaAttributes from './model/SchemaAttributes';
import SchemaList from './model/SchemaList';
import SchemaSubAttributes from './model/SchemaSubAttributes';
import ServiceProviderConfig from './model/ServiceProviderConfig';
import ServiceProviderConfigAuthenticationSchemes from './model/ServiceProviderConfigAuthenticationSchemes';
import ServiceProviderConfigBulk from './model/ServiceProviderConfigBulk';
import ServiceProviderConfigChangePassword from './model/ServiceProviderConfigChangePassword';
import ServiceProviderConfigEtag from './model/ServiceProviderConfigEtag';
import ServiceProviderConfigFilter from './model/ServiceProviderConfigFilter';
import ServiceProviderConfigPatch from './model/ServiceProviderConfigPatch';
import ServiceProviderConfigSort from './model/ServiceProviderConfigSort';
import UserResource from './model/UserResource';
import UserResourceGroups from './model/UserResourceGroups';
import UserResourceList from './model/UserResourceList';
import UserResourceMeta from './model/UserResourceMeta';
import UserResourceName from './model/UserResourceName';
import UserResourcePhoneNumbers from './model/UserResourcePhoneNumbers';
import UserResourceUrnScimSchemasExtensionCoreFactset10 from './model/UserResourceUrnScimSchemasExtensionCoreFactset10';
import VermilionGroupResource from './model/VermilionGroupResource';
import VermilionGroupResourceList from './model/VermilionGroupResourceList';
import VermilionGroupResourceMembers from './model/VermilionGroupResourceMembers';
import VermilionGroupResourceMeta from './model/VermilionGroupResourceMeta';
import VermilionUserResource from './model/VermilionUserResource';
import VermilionUserResourceEmails from './model/VermilionUserResourceEmails';
import VermilionUserResourceEntitlements from './model/VermilionUserResourceEntitlements';
import VermilionUserResourceGroups from './model/VermilionUserResourceGroups';
import VermilionUserResourceList from './model/VermilionUserResourceList';
import VermilionUserResourceMeta from './model/VermilionUserResourceMeta';
import VermilionUserResourceName from './model/VermilionUserResourceName';
import VermilionUserResourcePhoneNumbers from './model/VermilionUserResourcePhoneNumbers';
import VermilionUserResourcePhotos from './model/VermilionUserResourcePhotos';
import VermilionUserResourceRoles from './model/VermilionUserResourceRoles';

import FileManagerAuditApi from './api/FileManagerAuditApi';
import GroupsApi from './api/GroupsApi';
import LocationsApi from './api/LocationsApi';
import ProductsApi from './api/ProductsApi';
import SchemasApi from './api/SchemasApi';
import ServerConfigurationApi from './api/ServerConfigurationApi';
import UsersApi from './api/UsersApi';
import VermilionGroupsApi from './api/VermilionGroupsApi';
import VermilionUsersApi from './api/VermilionUsersApi';


/**
* Procure to Pay API: SCIM client library for JavaScript.<br>
* The <code>index</code> module provides access to constructors for all the classes which comprise the public API.
* <p>
* An AMD (recommended!) or CommonJS application will generally do something equivalent to the following:
* <pre>
* var procuretopayapiscim = require('index'); // See note below*.
* var xxxSvc = new procuretopayapiscim.XxxApi(); // Allocate the API class we're going to use.
* var yyyModel = new procuretopayapiscim.Yyy(); // Construct a model instance.
* yyyModel.someProperty = 'someValue';
* ...
* var zzz = xxxSvc.doSomething(yyyModel); // Invoke the service.
* ...
* </pre>
* <em>*NOTE: For a top-level AMD script, use require(['index'], function(){...})
* and put the application logic within the callback function.</em>
* </p>
* <p>
* A non-AMD browser application (discouraged) might do something like this:
* <pre>
* var xxxSvc = new procuretopayapiscim.XxxApi(); // Allocate the API class we're going to use.
* var yyy = new procuretopayapiscim.Yyy(); // Construct a model instance.
* yyyModel.someProperty = 'someValue';
* ...
* var zzz = xxxSvc.doSomething(yyyModel); // Invoke the service.
* ...
* </pre>
* </p>
* @module index
*/
export {
    /**
     * The ApiClient constructor.
     * @property {module:ApiClient}
     */
    ApiClient,

    /**
     * The Error model constructor.
     * @property {module:model/Error}
     */
    Error,

    /**
     * The GroupResource model constructor.
     * @property {module:model/GroupResource}
     */
    GroupResource,

    /**
     * The GroupResourceList model constructor.
     * @property {module:model/GroupResourceList}
     */
    GroupResourceList,

    /**
     * The GroupResourceMembers model constructor.
     * @property {module:model/GroupResourceMembers}
     */
    GroupResourceMembers,

    /**
     * The GroupResourceMeta model constructor.
     * @property {module:model/GroupResourceMeta}
     */
    GroupResourceMeta,

    /**
     * The GroupResourceUrnScimSchemasExtensionFactSetEnterpriseHosting10Group model constructor.
     * @property {module:model/GroupResourceUrnScimSchemasExtensionFactSetEnterpriseHosting10Group}
     */
    GroupResourceUrnScimSchemasExtensionFactSetEnterpriseHosting10Group,

    /**
     * The LocationResource model constructor.
     * @property {module:model/LocationResource}
     */
    LocationResource,

    /**
     * The LocationResourceList model constructor.
     * @property {module:model/LocationResourceList}
     */
    LocationResourceList,

    /**
     * The LocationResourceMeta model constructor.
     * @property {module:model/LocationResourceMeta}
     */
    LocationResourceMeta,

    /**
     * The LocationResourceReference model constructor.
     * @property {module:model/LocationResourceReference}
     */
    LocationResourceReference,

    /**
     * The Patch model constructor.
     * @property {module:model/Patch}
     */
    Patch,

    /**
     * The PatchOperations model constructor.
     * @property {module:model/PatchOperations}
     */
    PatchOperations,

    /**
     * The PendingProductOrder model constructor.
     * @property {module:model/PendingProductOrder}
     */
    PendingProductOrder,

    /**
     * The ProductResource model constructor.
     * @property {module:model/ProductResource}
     */
    ProductResource,

    /**
     * The ProductResourceList model constructor.
     * @property {module:model/ProductResourceList}
     */
    ProductResourceList,

    /**
     * The ProductResourceMeta model constructor.
     * @property {module:model/ProductResourceMeta}
     */
    ProductResourceMeta,

    /**
     * The ProductResourceReference model constructor.
     * @property {module:model/ProductResourceReference}
     */
    ProductResourceReference,

    /**
     * The Schema model constructor.
     * @property {module:model/Schema}
     */
    Schema,

    /**
     * The SchemaAttributes model constructor.
     * @property {module:model/SchemaAttributes}
     */
    SchemaAttributes,

    /**
     * The SchemaList model constructor.
     * @property {module:model/SchemaList}
     */
    SchemaList,

    /**
     * The SchemaSubAttributes model constructor.
     * @property {module:model/SchemaSubAttributes}
     */
    SchemaSubAttributes,

    /**
     * The ServiceProviderConfig model constructor.
     * @property {module:model/ServiceProviderConfig}
     */
    ServiceProviderConfig,

    /**
     * The ServiceProviderConfigAuthenticationSchemes model constructor.
     * @property {module:model/ServiceProviderConfigAuthenticationSchemes}
     */
    ServiceProviderConfigAuthenticationSchemes,

    /**
     * The ServiceProviderConfigBulk model constructor.
     * @property {module:model/ServiceProviderConfigBulk}
     */
    ServiceProviderConfigBulk,

    /**
     * The ServiceProviderConfigChangePassword model constructor.
     * @property {module:model/ServiceProviderConfigChangePassword}
     */
    ServiceProviderConfigChangePassword,

    /**
     * The ServiceProviderConfigEtag model constructor.
     * @property {module:model/ServiceProviderConfigEtag}
     */
    ServiceProviderConfigEtag,

    /**
     * The ServiceProviderConfigFilter model constructor.
     * @property {module:model/ServiceProviderConfigFilter}
     */
    ServiceProviderConfigFilter,

    /**
     * The ServiceProviderConfigPatch model constructor.
     * @property {module:model/ServiceProviderConfigPatch}
     */
    ServiceProviderConfigPatch,

    /**
     * The ServiceProviderConfigSort model constructor.
     * @property {module:model/ServiceProviderConfigSort}
     */
    ServiceProviderConfigSort,

    /**
     * The UserResource model constructor.
     * @property {module:model/UserResource}
     */
    UserResource,

    /**
     * The UserResourceGroups model constructor.
     * @property {module:model/UserResourceGroups}
     */
    UserResourceGroups,

    /**
     * The UserResourceList model constructor.
     * @property {module:model/UserResourceList}
     */
    UserResourceList,

    /**
     * The UserResourceMeta model constructor.
     * @property {module:model/UserResourceMeta}
     */
    UserResourceMeta,

    /**
     * The UserResourceName model constructor.
     * @property {module:model/UserResourceName}
     */
    UserResourceName,

    /**
     * The UserResourcePhoneNumbers model constructor.
     * @property {module:model/UserResourcePhoneNumbers}
     */
    UserResourcePhoneNumbers,

    /**
     * The UserResourceUrnScimSchemasExtensionCoreFactset10 model constructor.
     * @property {module:model/UserResourceUrnScimSchemasExtensionCoreFactset10}
     */
    UserResourceUrnScimSchemasExtensionCoreFactset10,

    /**
     * The VermilionGroupResource model constructor.
     * @property {module:model/VermilionGroupResource}
     */
    VermilionGroupResource,

    /**
     * The VermilionGroupResourceList model constructor.
     * @property {module:model/VermilionGroupResourceList}
     */
    VermilionGroupResourceList,

    /**
     * The VermilionGroupResourceMembers model constructor.
     * @property {module:model/VermilionGroupResourceMembers}
     */
    VermilionGroupResourceMembers,

    /**
     * The VermilionGroupResourceMeta model constructor.
     * @property {module:model/VermilionGroupResourceMeta}
     */
    VermilionGroupResourceMeta,

    /**
     * The VermilionUserResource model constructor.
     * @property {module:model/VermilionUserResource}
     */
    VermilionUserResource,

    /**
     * The VermilionUserResourceEmails model constructor.
     * @property {module:model/VermilionUserResourceEmails}
     */
    VermilionUserResourceEmails,

    /**
     * The VermilionUserResourceEntitlements model constructor.
     * @property {module:model/VermilionUserResourceEntitlements}
     */
    VermilionUserResourceEntitlements,

    /**
     * The VermilionUserResourceGroups model constructor.
     * @property {module:model/VermilionUserResourceGroups}
     */
    VermilionUserResourceGroups,

    /**
     * The VermilionUserResourceList model constructor.
     * @property {module:model/VermilionUserResourceList}
     */
    VermilionUserResourceList,

    /**
     * The VermilionUserResourceMeta model constructor.
     * @property {module:model/VermilionUserResourceMeta}
     */
    VermilionUserResourceMeta,

    /**
     * The VermilionUserResourceName model constructor.
     * @property {module:model/VermilionUserResourceName}
     */
    VermilionUserResourceName,

    /**
     * The VermilionUserResourcePhoneNumbers model constructor.
     * @property {module:model/VermilionUserResourcePhoneNumbers}
     */
    VermilionUserResourcePhoneNumbers,

    /**
     * The VermilionUserResourcePhotos model constructor.
     * @property {module:model/VermilionUserResourcePhotos}
     */
    VermilionUserResourcePhotos,

    /**
     * The VermilionUserResourceRoles model constructor.
     * @property {module:model/VermilionUserResourceRoles}
     */
    VermilionUserResourceRoles,

    /**
    * The FileManagerAuditApi service constructor.
    * @property {module:api/FileManagerAuditApi}
    */
    FileManagerAuditApi,

    /**
    * The GroupsApi service constructor.
    * @property {module:api/GroupsApi}
    */
    GroupsApi,

    /**
    * The LocationsApi service constructor.
    * @property {module:api/LocationsApi}
    */
    LocationsApi,

    /**
    * The ProductsApi service constructor.
    * @property {module:api/ProductsApi}
    */
    ProductsApi,

    /**
    * The SchemasApi service constructor.
    * @property {module:api/SchemasApi}
    */
    SchemasApi,

    /**
    * The ServerConfigurationApi service constructor.
    * @property {module:api/ServerConfigurationApi}
    */
    ServerConfigurationApi,

    /**
    * The UsersApi service constructor.
    * @property {module:api/UsersApi}
    */
    UsersApi,

    /**
    * The VermilionGroupsApi service constructor.
    * @property {module:api/VermilionGroupsApi}
    */
    VermilionGroupsApi,

    /**
    * The VermilionUsersApi service constructor.
    * @property {module:api/VermilionUsersApi}
    */
    VermilionUsersApi,

};
