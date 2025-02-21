package com.example.SampleProjects.CloudVendorAPI.controller;

import com.example.SampleProjects.CloudVendorAPI.model.CloudVendor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cloudVendor")
public class CloudVendorAPI {

    private CloudVendor cloudVendor;

    @PostMapping("/")
    public String createVendorDetails(@RequestBody CloudVendor cloudVendor){
        this.cloudVendor = cloudVendor;
        return "Created Vendor Details Successfully";
    }

    @GetMapping("{vendorId}")
    public CloudVendor getVendorDetails(@PathVariable String vendorId){
//        return new CloudVendor("1","name","Ind","234");
        return this.cloudVendor;
    }

    @PutMapping("/")
    public String updateVendorDetails(@RequestBody CloudVendor cloudVendor){
        this.cloudVendor = cloudVendor;
        return "Updated Vendor Details Successfully";
    }

    @DeleteMapping("/{vendorId}")
    public String deleteVendorDetails(@PathVariable String vendorId){
        return "Deleted Vendor Details Successfully";
    }


}
