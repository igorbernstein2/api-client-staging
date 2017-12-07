<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/oslogin/v1alpha/oslogin.proto

namespace Google\Cloud\Oslogin\V1alpha;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * A request message for deleting an SSH public key.
 *
 * Generated from protobuf message <code>google.cloud.oslogin.v1alpha.DeleteSshPublicKeyRequest</code>
 */
class DeleteSshPublicKeyRequest extends \Google\Protobuf\Internal\Message
{
    /**
     * The fingerprint of the public key to update. Public keys are identified by
     * their SHA-256 fingerprint. The fingerprint of the public key is in format
     * `users/{user}/sshPublicKeys/{fingerprint}`.
     *
     * Generated from protobuf field <code>string name = 1;</code>
     */
    private $name = '';

    public function __construct() {
        \GPBMetadata\Google\Cloud\Oslogin\V1Alpha\Oslogin::initOnce();
        parent::__construct();
    }

    /**
     * The fingerprint of the public key to update. Public keys are identified by
     * their SHA-256 fingerprint. The fingerprint of the public key is in format
     * `users/{user}/sshPublicKeys/{fingerprint}`.
     *
     * Generated from protobuf field <code>string name = 1;</code>
     * @return string
     */
    public function getName()
    {
        return $this->name;
    }

    /**
     * The fingerprint of the public key to update. Public keys are identified by
     * their SHA-256 fingerprint. The fingerprint of the public key is in format
     * `users/{user}/sshPublicKeys/{fingerprint}`.
     *
     * Generated from protobuf field <code>string name = 1;</code>
     * @param string $var
     * @return $this
     */
    public function setName($var)
    {
        GPBUtil::checkString($var, True);
        $this->name = $var;

        return $this;
    }

}

