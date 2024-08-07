/**
 * Asset Cash Flow Projections API
 * Allow clients to upload scenario files through APIs.
 *
 * The version of the OpenAPI document: 0.1.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import ClientScenariosUploadParameters from './ClientScenariosUploadParameters';

/**
 * The ClientScenariosUpload model module.
 * @module model/ClientScenariosUpload
 */
class ClientScenariosUpload {
    /**
     * Constructs a new <code>ClientScenariosUpload</code>.
     * Details required for uploading scenario files wrapped in a data object
     * @alias module:model/ClientScenariosUpload
     */
    constructor() { 
        
        ClientScenariosUpload.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ClientScenariosUpload</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ClientScenariosUpload} obj Optional instance to populate.
     * @return {module:model/ClientScenariosUpload} The populated <code>ClientScenariosUpload</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ClientScenariosUpload();

            if (data.hasOwnProperty('data')) {
                obj['data'] = ClientScenariosUploadParameters.constructFromObject(data['data']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/ClientScenariosUploadParameters} data
 */
ClientScenariosUpload.prototype['data'] = undefined;






export default ClientScenariosUpload;

