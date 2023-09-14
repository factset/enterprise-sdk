/**
 * Portfolio Reporting Batcher
 * The Portfolio Reporting Batcher (PRB) API allows clients to systematically leverage functionalities of the PRB application. With the initial release, clients can - trigger existing jobs - check status of running jobs - get various details of existing jobs
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
import StartJob from './StartJob';

/**
 * The StartJobRoot model module.
 * @module model/StartJobRoot
 */
class StartJobRoot {
    /**
     * Constructs a new <code>StartJobRoot</code>.
     * Details required to start the job wrapped in a data object
     * @alias module:model/StartJobRoot
     */
    constructor() { 
        
        StartJobRoot.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>StartJobRoot</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/StartJobRoot} obj Optional instance to populate.
     * @return {module:model/StartJobRoot} The populated <code>StartJobRoot</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new StartJobRoot();

            if (data.hasOwnProperty('data')) {
                obj['data'] = StartJob.constructFromObject(data['data']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/StartJob} data
 */
StartJobRoot.prototype['data'] = undefined;






export default StartJobRoot;
