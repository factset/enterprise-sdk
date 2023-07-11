/**
 * FPE API
 * FactSet Programmatic Environment (FPE) API is an API for users to interact with FPE programmatically, streamlining path from research to production.
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';

/**
 * The FileUploadStatus model module.
 * @module model/FileUploadStatus
 */
class FileUploadStatus {
    /**
     * Constructs a new <code>FileUploadStatus</code>.
     * @alias module:model/FileUploadStatus
     */
    constructor() { 
        
        FileUploadStatus.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>FileUploadStatus</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/FileUploadStatus} obj Optional instance to populate.
     * @return {module:model/FileUploadStatus} The populated <code>FileUploadStatus</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new FileUploadStatus();

            if (data.hasOwnProperty('id')) {
                obj['id'] = ApiClient.convertToType(data['id'], 'String');
            }
            if (data.hasOwnProperty('status')) {
                obj['status'] = ApiClient.convertToType(data['status'], 'String');
            }
        }
        return obj;
    }


}

/**
 * The unique ID for this upload
 * @member {String} id
 */
FileUploadStatus.prototype['id'] = undefined;

/**
 * @member {module:model/FileUploadStatus.StatusEnum} status
 */
FileUploadStatus.prototype['status'] = undefined;





/**
 * Allowed values for the <code>status</code> property.
 * @enum {String}
 * @readonly
 */
FileUploadStatus['StatusEnum'] = {

    /**
     * value: "pending"
     * @const
     */
    "pending": "pending",

    /**
     * value: "failed"
     * @const
     */
    "failed": "failed",

    /**
     * value: "completed"
     * @const
     */
    "completed": "completed",

    /**
     * value: "running"
     * @const
     */
    "running": "running"
};



export default FileUploadStatus;

