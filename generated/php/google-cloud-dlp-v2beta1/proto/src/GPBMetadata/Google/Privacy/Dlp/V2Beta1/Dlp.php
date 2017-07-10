<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/privacy/dlp/v2beta1/dlp.proto

namespace GPBMetadata\Google\Privacy\Dlp\V2Beta1;

class Dlp
{
    public static $is_initialized = false;

    public static function initOnce() {
        $pool = \Google\Protobuf\Internal\DescriptorPool::getGeneratedPool();

        if (static::$is_initialized == true) {
          return;
        }
        \GPBMetadata\Google\Api\Annotations::initOnce();
        \GPBMetadata\Google\Longrunning\Operations::initOnce();
        \GPBMetadata\Google\Privacy\Dlp\V2Beta1\Storage::initOnce();
        \GPBMetadata\Google\Protobuf\GPBEmpty::initOnce();
        \GPBMetadata\Google\Protobuf\Timestamp::initOnce();
        \GPBMetadata\Google\Type\Date::initOnce();
        \GPBMetadata\Google\Type\Timeofday::initOnce();
        $pool->internalAddGeneratedFile(hex2bin(
            "0ace280a24676f6f676c652f707269766163792f646c702f763262657461" .
            "312f646c702e70726f746f121a676f6f676c652e707269766163792e646c" .
            "702e763262657461311a23676f6f676c652f6c6f6e6772756e6e696e672f" .
            "6f7065726174696f6e732e70726f746f1a28676f6f676c652f7072697661" .
            "63792f646c702f763262657461312f73746f726167652e70726f746f1a1b" .
            "676f6f676c652f70726f746f6275662f656d7074792e70726f746f1a1f67" .
            "6f6f676c652f70726f746f6275662f74696d657374616d702e70726f746f" .
            "1a16676f6f676c652f747970652f646174652e70726f746f1a1b676f6f67" .
            "6c652f747970652f74696d656f666461792e70726f746f22cd010a0d496e" .
            "7370656374436f6e66696712380a0a696e666f5f74797065731801200328" .
            "0b32242e676f6f676c652e707269766163792e646c702e76326265746131" .
            "2e496e666f54797065123e0a0e6d696e5f6c696b656c69686f6f64180220" .
            "01280e32262e676f6f676c652e707269766163792e646c702e7632626574" .
            "61312e4c696b656c69686f6f6412140a0c6d61785f66696e64696e677318" .
            "032001280512150a0d696e636c7564655f71756f74651804200128081215" .
            "0a0d6578636c7564655f747970657318062001280822490a0b436f6e7465" .
            "6e744974656d120c0a0474797065180120012809120e0a04646174611802" .
            "2001280c4800120f0a0576616c75651803200128094800420b0a09646174" .
            "615f6974656d22620a0d496e7370656374526573756c7412350a0866696e" .
            "64696e677318012003280b32232e676f6f676c652e707269766163792e64" .
            "6c702e763262657461312e46696e64696e67121a0a1266696e64696e6773" .
            "5f7472756e636174656418022001280822f6010a0746696e64696e67120d" .
            "0a0571756f746518012001280912370a09696e666f5f7479706518022001" .
            "280b32242e676f6f676c652e707269766163792e646c702e763262657461" .
            "312e496e666f54797065123a0a0a6c696b656c69686f6f6418032001280e" .
            "32262e676f6f676c652e707269766163792e646c702e763262657461312e" .
            "4c696b656c69686f6f6412360a086c6f636174696f6e18042001280b3224" .
            "2e676f6f676c652e707269766163792e646c702e763262657461312e4c6f" .
            "636174696f6e122f0a0b6372656174655f74696d6518062001280b321a2e" .
            "676f6f676c652e70726f746f6275662e54696d657374616d7022af020a08" .
            "4c6f636174696f6e12350a0a627974655f72616e676518012001280b3221" .
            "2e676f6f676c652e707269766163792e646c702e763262657461312e5261" .
            "6e6765123a0a0f636f6465706f696e745f72616e676518022001280b3221" .
            "2e676f6f676c652e707269766163792e646c702e763262657461312e5261" .
            "6e6765123e0a0b696d6167655f626f78657318032003280b32292e676f6f" .
            "676c652e707269766163792e646c702e763262657461312e496d6167654c" .
            "6f636174696f6e12390a0a7265636f72645f6b657918042001280b32252e" .
            "676f6f676c652e707269766163792e646c702e763262657461312e526563" .
            "6f72644b657912350a086669656c645f696418052001280b32232e676f6f" .
            "676c652e707269766163792e646c702e763262657461312e4669656c6449" .
            "6422230a0552616e6765120d0a057374617274180120012803120b0a0365" .
            "6e6418022001280322490a0d496d6167654c6f636174696f6e120b0a0374" .
            "6f70180120012805120c0a046c656674180220012805120d0a0577696474" .
            "68180320012805120e0a0668656967687418042001280522e7040a145265" .
            "64616374436f6e74656e745265717565737412410a0e696e73706563745f" .
            "636f6e66696718012001280b32292e676f6f676c652e707269766163792e" .
            "646c702e763262657461312e496e7370656374436f6e66696712360a0569" .
            "74656d7318022003280b32272e676f6f676c652e707269766163792e646c" .
            "702e763262657461312e436f6e74656e744974656d12570a0f7265706c61" .
            "63655f636f6e6669677318032003280b323e2e676f6f676c652e70726976" .
            "6163792e646c702e763262657461312e526564616374436f6e74656e7452" .
            "6571756573742e5265706c616365436f6e66696712660a17696d6167655f" .
            "726564616374696f6e5f636f6e6669677318042003280b32452e676f6f67" .
            "6c652e707269766163792e646c702e763262657461312e52656461637443" .
            "6f6e74656e74526571756573742e496d616765526564616374696f6e436f" .
            "6e6669671a5e0a0d5265706c616365436f6e66696712370a09696e666f5f" .
            "7479706518012001280b32242e676f6f676c652e707269766163792e646c" .
            "702e763262657461312e496e666f5479706512140a0c7265706c6163655f" .
            "776974681802200128091ab2010a14496d616765526564616374696f6e43" .
            "6f6e66696712390a09696e666f5f7479706518012001280b32242e676f6f" .
            "676c652e707269766163792e646c702e763262657461312e496e666f5479" .
            "7065480012190a0f7265646163745f616c6c5f7465787418022001280848" .
            "00123a0a0f726564616374696f6e5f636f6c6f7218032001280b32212e67" .
            "6f6f676c652e707269766163792e646c702e763262657461312e436f6c6f" .
            "7242080a0674617267657422310a05436f6c6f72120b0a03726564180120" .
            "012802120d0a05677265656e180220012802120c0a04626c756518032001" .
            "2802224f0a15526564616374436f6e74656e74526573706f6e736512360a" .
            "056974656d7318012003280b32272e676f6f676c652e707269766163792e" .
            "646c702e763262657461312e436f6e74656e744974656d2292010a15496e" .
            "7370656374436f6e74656e745265717565737412410a0e696e7370656374" .
            "5f636f6e66696718012001280b32292e676f6f676c652e70726976616379" .
            "2e646c702e763262657461312e496e7370656374436f6e66696712360a05" .
            "6974656d7318022003280b32272e676f6f676c652e707269766163792e64" .
            "6c702e763262657461312e436f6e74656e744974656d22540a16496e7370" .
            "656374436f6e74656e74526573706f6e7365123a0a07726573756c747318" .
            "012003280b32292e676f6f676c652e707269766163792e646c702e763262" .
            "657461312e496e7370656374526573756c7422ed010a1d43726561746549" .
            "6e73706563744f7065726174696f6e5265717565737412410a0e696e7370" .
            "6563745f636f6e66696718012001280b32292e676f6f676c652e70726976" .
            "6163792e646c702e763262657461312e496e7370656374436f6e66696712" .
            "410a0e73746f726167655f636f6e66696718022001280b32292e676f6f67" .
            "6c652e707269766163792e646c702e763262657461312e53746f72616765" .
            "436f6e66696712460a0d6f75747075745f636f6e66696718032001280b32" .
            "2f2e676f6f676c652e707269766163792e646c702e763262657461312e4f" .
            "757470757453746f72616765436f6e66696722630a134f75747075745374" .
            "6f72616765436f6e66696712440a0c73746f726167655f70617468180220" .
            "01280b322c2e676f6f676c652e707269766163792e646c702e7632626574" .
            "61312e436c6f756453746f7261676550617468480042060a047479706522" .
            "5c0a12496e666f547970655374617469737469637312370a09696e666f5f" .
            "7479706518012001280b32242e676f6f676c652e707269766163792e646c" .
            "702e763262657461312e496e666f54797065120d0a05636f756e74180220" .
            "01280322b2030a18496e73706563744f7065726174696f6e4d6574616461" .
            "746112170a0f70726f6365737365645f6279746573180120012803121d0a" .
            "15746f74616c5f657374696d617465645f62797465731804200128031247" .
            "0a0f696e666f5f747970655f737461747318022003280b322e2e676f6f67" .
            "6c652e707269766163792e646c702e763262657461312e496e666f547970" .
            "6553746174697374696373122f0a0b6372656174655f74696d6518032001" .
            "280b321a2e676f6f676c652e70726f746f6275662e54696d657374616d70" .
            "12490a16726571756573745f696e73706563745f636f6e66696718052001" .
            "280b32292e676f6f676c652e707269766163792e646c702e763262657461" .
            "312e496e7370656374436f6e66696712490a16726571756573745f73746f" .
            "726167655f636f6e66696718062001280b32292e676f6f676c652e707269" .
            "766163792e646c702e763262657461312e53746f72616765436f6e666967" .
            "124e0a15726571756573745f6f75747075745f636f6e6669671807200128" .
            "0b322f2e676f6f676c652e707269766163792e646c702e76326265746131" .
            "2e4f757470757453746f72616765436f6e66696722260a16496e73706563" .
            "744f7065726174696f6e526573756c74120c0a046e616d65180120012809" .
            "22610a1a4c697374496e737065637446696e64696e677352657175657374" .
            "120c0a046e616d6518012001280912110a09706167655f73697a65180220" .
            "01280512120a0a706167655f746f6b656e180320012809120e0a0666696c" .
            "74657218042001280922710a1b4c697374496e737065637446696e64696e" .
            "6773526573706f6e736512390a06726573756c7418012001280b32292e67" .
            "6f6f676c652e707269766163792e646c702e763262657461312e496e7370" .
            "656374526573756c7412170a0f6e6578745f706167655f746f6b656e1802" .
            "20012809227e0a13496e666f547970654465736372697074696f6e120c0a" .
            "046e616d6518012001280912140a0c646973706c61795f6e616d65180220" .
            "01280912430a0a63617465676f7269657318032003280b322f2e676f6f67" .
            "6c652e707269766163792e646c702e763262657461312e43617465676f72" .
            "794465736372697074696f6e223f0a144c697374496e666f547970657352" .
            "65717565737412100a0863617465676f727918012001280912150a0d6c61" .
            "6e67756167655f636f6465180220012809225c0a154c697374496e666f54" .
            "79706573526573706f6e736512430a0a696e666f5f747970657318012003" .
            "280b322f2e676f6f676c652e707269766163792e646c702e763262657461" .
            "312e496e666f547970654465736372697074696f6e22390a134361746567" .
            "6f72794465736372697074696f6e120c0a046e616d651801200128091214" .
            "0a0c646973706c61795f6e616d6518022001280922320a194c697374526f" .
            "6f7443617465676f726965735265717565737412150a0d6c616e67756167" .
            "655f636f646518012001280922610a1a4c697374526f6f7443617465676f" .
            "72696573526573706f6e736512430a0a63617465676f7269657318012003" .
            "280b322f2e676f6f676c652e707269766163792e646c702e763262657461" .
            "312e43617465676f72794465736372697074696f6e2a740a0a4c696b656c" .
            "69686f6f64121a0a164c494b454c49484f4f445f554e5350454349464945" .
            "44100012110a0d564552595f554e4c494b454c591001120c0a08554e4c49" .
            "4b454c591002120c0a08504f535349424c451003120a0a064c494b454c59" .
            "1004120f0a0b564552595f4c494b454c59100532f6070a0a446c70536572" .
            "76696365129c010a0e496e7370656374436f6e74656e7412312e676f6f67" .
            "6c652e707269766163792e646c702e763262657461312e496e7370656374" .
            "436f6e74656e74526571756573741a322e676f6f676c652e707269766163" .
            "792e646c702e763262657461312e496e7370656374436f6e74656e745265" .
            "73706f6e7365222382d3e493021d22182f763262657461312f636f6e7465" .
            "6e743a696e73706563743a012a1298010a0d526564616374436f6e74656e" .
            "7412302e676f6f676c652e707269766163792e646c702e76326265746131" .
            "2e526564616374436f6e74656e74526571756573741a312e676f6f676c65" .
            "2e707269766163792e646c702e763262657461312e526564616374436f6e" .
            "74656e74526573706f6e7365222282d3e493021c22172f76326265746131" .
            "2f636f6e74656e743a7265646163743a012a129a010a1643726561746549" .
            "6e73706563744f7065726174696f6e12392e676f6f676c652e7072697661" .
            "63792e646c702e763262657461312e437265617465496e73706563744f70" .
            "65726174696f6e526571756573741a1d2e676f6f676c652e6c6f6e677275" .
            "6e6e696e672e4f7065726174696f6e222682d3e4930220221b2f76326265" .
            "7461312f696e73706563742f6f7065726174696f6e733a012a12ba010a13" .
            "4c697374496e737065637446696e64696e677312362e676f6f676c652e70" .
            "7269766163792e646c702e763262657461312e4c697374496e7370656374" .
            "46696e64696e6773526571756573741a372e676f6f676c652e7072697661" .
            "63792e646c702e763262657461312e4c697374496e737065637446696e64" .
            "696e6773526573706f6e7365223282d3e493022c122a2f76326265746131" .
            "2f7b6e616d653d696e73706563742f726573756c74732f2a7d2f66696e64" .
            "696e677312ac010a0d4c697374496e666f547970657312302e676f6f676c" .
            "652e707269766163792e646c702e763262657461312e4c697374496e666f" .
            "5479706573526571756573741a312e676f6f676c652e707269766163792e" .
            "646c702e763262657461312e4c697374496e666f5479706573526573706f" .
            "6e7365223682d3e4930230122e2f763262657461312f726f6f7443617465" .
            "676f726965732f7b63617465676f72793d2a7d2f696e666f547970657312" .
            "a4010a124c697374526f6f7443617465676f7269657312352e676f6f676c" .
            "652e707269766163792e646c702e763262657461312e4c697374526f6f74" .
            "43617465676f72696573526571756573741a362e676f6f676c652e707269" .
            "766163792e646c702e763262657461312e4c697374526f6f744361746567" .
            "6f72696573526573706f6e7365221f82d3e493021912172f763262657461" .
            "312f726f6f7443617465676f726965734286010a1e636f6d2e676f6f676c" .
            "652e707269766163792e646c702e763262657461314208446c7050726f74" .
            "6f50015a3d676f6f676c652e676f6c616e672e6f72672f67656e70726f74" .
            "6f2f676f6f676c65617069732f707269766163792f646c702f7632626574" .
            "61313b646c70aa0218476f6f676c652e436c6f75642e446c702e56324265" .
            "746131620670726f746f33"
        ));

        static::$is_initialized = true;
    }
}
