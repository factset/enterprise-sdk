/**
 * Universal Screening API
 * Through the Universal Screening API, you can access the power of FactSet's Universal Screening Application. Calculate and return the results of your saved Universal Screens.
 *
 * The version of the OpenAPI document: 2.0.2
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import ResourceStatusResponseData from './ResourceStatusResponseData';

/**
 * The ResourceStatusResponse model module.
 * @module model/ResourceStatusResponse
 */
class ResourceStatusResponse {
    /**
     * Constructs a new <code>ResourceStatusResponse</code>.
     * ResourceStatusResponse contains information regarding the status of a long-running job. \&quot;Job\&quot; refers to a screen calculation or archival.
     * @alias module:model/ResourceStatusResponse
     */
    constructor() { 
        
        ResourceStatusResponse.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ResourceStatusResponse</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ResourceStatusResponse} obj Optional instance to populate.
     * @return {module:model/ResourceStatusResponse} The populated <code>ResourceStatusResponse</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ResourceStatusResponse();

            if (data.hasOwnProperty('data')) {
                obj['data'] = ResourceStatusResponseData.constructFromObject(data['data']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/ResourceStatusResponseData} data
 */
ResourceStatusResponse.prototype['data'] = undefined;






export default ResourceStatusResponse;

